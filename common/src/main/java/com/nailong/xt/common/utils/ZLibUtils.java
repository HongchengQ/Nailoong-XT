package com.nailong.xt.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.NonNull;

import java.io.*;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

@Slf4j
public final class ZLibUtils {

    // 定义不同的缓冲区大小阈值
    private static final int SMALL_DATA_THRESHOLD = 1024;          // 1KB
    private static final int MEDIUM_DATA_THRESHOLD = 1024 * 100;   // 100KB
    private static final int LARGE_DATA_THRESHOLD = 1024 * 1024;   // 1MB

    // 定义不同数据规模对应的缓冲区大小
    private static final int SMALL_BUFFER_SIZE = 8192;      // 8KB for small data
    private static final int MEDIUM_BUFFER_SIZE = 32768;    // 32KB for medium data
    private static final int LARGE_BUFFER_SIZE = 65536;     // 64KB for large data
    private static final int HUGE_BUFFER_SIZE = 262144;     // 256KB for huge data

    /**
     * 使用zlib压缩byte数组 - 自动选择最适合的缓冲区大小
     *
     * @param data 待压缩的字节数组
     * @return 压缩后的字节数组
     * @throws RuntimeException 如果压缩过程中发生错误
     */
    public static byte[] compressZlib(byte[] data) {
        if (data == null || data.length == 0) {
            return data;
        }

        // 根据数据大小选择合适的缓冲区和策略
        int bufferSize = selectBufferSize(data.length);

        // 对于小到中等大小的数据，使用内存缓冲区方法
        if (data.length < LARGE_DATA_THRESHOLD) {
            return compressZlibWithBuffer(data, bufferSize);
        }

        // 对于大文件，使用流式处理
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(calculateInitialCapacity(data.length));

            compressStream(inputStream, outputStream, bufferSize);

            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Stream compression failed", e);
        }

    }


    /**
     * 使用zlib解压缩byte数组 - 自动选择最适合的缓冲区大小
     *
     * @param compressedData 待解压的压缩字节数组
     * @return 解压后的字节数组
     * @throws RuntimeException 如果解压过程中发生错误
     */
    public static byte[] decompressZlib(byte[] compressedData) {
        if (compressedData == null || compressedData.length == 0) {
            return compressedData;
        }

        // 根据压缩后数据大小估算原数据大小，并选择合适的缓冲区
        int estimatedOriginalSize = estimateOriginalSize(compressedData.length);
        int bufferSize = selectBufferSize(estimatedOriginalSize);

        // 对于小到中等大小的数据，使用内存缓冲区方法
        if (estimatedOriginalSize < LARGE_DATA_THRESHOLD) {
            return decompressZlibWithBuffer(compressedData, bufferSize);
        }

        // 对于大文件，使用流式处理
        try {
            ByteArrayInputStream inputStream = new ByteArrayInputStream(compressedData);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            decompressStream(inputStream, outputStream, bufferSize);

            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Stream decompression failed", e);
        }
    }

    /**
     * 使用指定缓冲区大小进行压缩
     */
    private static byte[] compressZlibWithBuffer(byte[] data, int bufferSize) {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION);

        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(calculateInitialCapacity(data.length));
        byte[] buffer = new byte[bufferSize];

        try {
            while (!deflater.finished()) {
                int count = deflater.deflate(buffer, 0, bufferSize);
                if (count > 0) {
                    outputStream.write(buffer, 0, count);
                }
            }
        } finally {
            deflater.end();
        }

        try {
            outputStream.close();
        } catch (IOException e) {
            log.warn("Error closing ByteArrayOutputStream during compression", e);
        }

        return outputStream.toByteArray();
    }

    /**
     * 使用指定缓冲区大小进行解压
     */
    private static byte[] decompressZlibWithBuffer(byte[] compressedData, int bufferSize) {
        Inflater inflater = new Inflater();
        inflater.setInput(compressedData);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[bufferSize];

        try {
            int count;
            while (!inflater.finished()) {
                try {
                    count = inflater.inflate(buffer, 0, bufferSize);
                    if (count > 0) {
                        outputStream.write(buffer, 0, count);
                    } else if (count == 0 && inflater.needsInput()) {
                        // 如果不需要更多输入但也没有输出，则退出
                        break;
                    }
                } catch (java.util.zip.DataFormatException e) {
                    throw new RuntimeException("Invalid compressed data format", e);
                }
            }
        } finally {
            inflater.end();
        }

        try {
            outputStream.close();
        } catch (IOException e) {
            log.warn("Error closing ByteArrayOutputStream during decompression", e);
        }

        return outputStream.toByteArray();
    }

    /**
     * 根据数据大小选择合适的缓冲区大小
     */
    private static int selectBufferSize(int dataSize) {
        if (dataSize <= SMALL_DATA_THRESHOLD) {
            return SMALL_BUFFER_SIZE;
        } else if (dataSize <= MEDIUM_DATA_THRESHOLD) {
            return MEDIUM_BUFFER_SIZE;
        } else if (dataSize <= LARGE_DATA_THRESHOLD) {
            return LARGE_BUFFER_SIZE;
        } else {
            return HUGE_BUFFER_SIZE;
        }
    }

    /**
     * 估算原始数据大小，用于选择缓冲区
     */
    private static int estimateOriginalSize(int compressedSize) {
        // 简单估算：假设压缩比为 1:2 到 1:3 之间
        return Math.max(SMALL_DATA_THRESHOLD, compressedSize * 2);
    }

    /**
     * 计算输出流的初始容量
     */
    private static int calculateInitialCapacity(int originalSize) {
        // 为输出流设置合理的初始容量，避免多次扩容
        if (originalSize <= MEDIUM_DATA_THRESHOLD) {
            return Math.max(originalSize / 2, 1024); // 保守估计
        } else {
            return Math.max(originalSize / 4, 65536); // 对于大数据，预分配较小比例
        }
    }

    /**
     * 针对超大文件的流式压缩方法，节省内存
     *
     * @param inputStream  输入流
     * @param outputStream 输出流
     * @param bufferSize   缓冲区大小
     * @throws IOException 压缩过程中的IO异常
     */
    public static void compressStream(InputStream inputStream, OutputStream outputStream, int bufferSize) throws IOException {
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater, bufferSize);

        byte[] buffer = new byte[bufferSize];
        int bytesRead;

        try {
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                deflaterOutputStream.write(buffer, 0, bytesRead);
            }
            deflaterOutputStream.finish();
        } finally {
            deflaterOutputStream.flush();
        }
    }

    /**
     * 针对超大文件的流式解压方法，节省内存
     *
     * @param inputStream  压缩数据输入流
     * @param outputStream 解压数据输出流
     * @param bufferSize   缓冲区大小
     * @throws IOException 解压过程中的IO异常
     */
    public static void decompressStream(InputStream inputStream, OutputStream outputStream, int bufferSize) throws IOException {
        Inflater inflater = new Inflater();
        InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream, inflater, bufferSize);

        byte[] buffer = new byte[bufferSize];
        int bytesRead;

        try {
            while ((bytesRead = inflaterInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            inflater.end();
        }
    }
}