package com.nailong.xt.common.model.po;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.GeneratedValue;
import org.babyfish.jimmer.sql.GenerationType;
import org.babyfish.jimmer.sql.Id;
import org.jetbrains.annotations.Nullable;

/*
CREATE TABLE `player_data` (
  `uid` int(10) unsigned  DEFAULT 0,
  `nickname` varchar(128)  DEFAULT '0',
  `level` int(10) unsigned  DEFAULT 0,
  `exp` int(10) unsigned DEFAULT 0,
  `json_data` varchar(512)  DEFAULT '',
  `bin_data` mediumblob ,
  `before_login_bin_data` blob DEFAULT NULL COMMENT 'login前用的数据',
  `data_version` int(10) unsigned  DEFAULT 0,
  `create_time` timestamp  DEFAULT current_timestamp(),
  `last_save_time` timestamp  DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `is_delete` tinyint(1)  DEFAULT 0 COMMENT '是否为废弃数据',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='玩家核心数据包';

 */
@Entity
public interface PlayerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id();

    @Nullable
    String nickname();

    @Nullable
    Short level();

    @Nullable
    Integer exp();

    // 备用
    @Nullable
    String jsonData();

    // bin_player_data.proto - PlayerDataBin
    @Nullable
    Byte[] binData();

    // 不知道能存什么 先备着
    @Nullable
    Byte[] beforeLoginBinData();

    // 数据版本号，每次回写自动+1, 用来防止因回写顺序引起的回档
    @Nullable
    Integer dataVersion();

    @Nullable
    Boolean isDelete();
}
