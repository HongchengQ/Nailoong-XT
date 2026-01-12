package com.nailong.xt.common.model.po;

import com.nailong.xt.proto.server.BinPlayerData.PlayerDataBin;
import org.babyfish.jimmer.sql.*;
import org.jetbrains.annotations.Nullable;

// todo: accountUid
/*

CREATE TABLE `player_data` (
  `uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `account_uid` int unsigned NOT NULL,
  `nickname` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `level` int(10) unsigned DEFAULT NULL,
  `exp` int(10) unsigned DEFAULT NULL,
  `json_data` varchar(512) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `bin_data` mediumblob NOT NULL,
  `before_login_bin_data` blob COMMENT 'login前用的数据',
  `data_version` int(10) unsigned NOT NULL,
  `create_time` timestamp  DEFAULT current_timestamp(),
  `last_save_time` timestamp  DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `is_delete` tinyint(1) DEFAULT '0' COMMENT '是否为废弃数据',
  PRIMARY KEY (`uid`,`account_uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='玩家核心数据包';

 */
@Entity
@Table(name = "player_data")
public interface PlayerDataPo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int uid();

    @Key
    long accountUid();

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
    PlayerDataBin binData();

    // 不知道能存什么 先备着
    byte @Nullable [] beforeLoginBinData();

    // 数据版本号，每次回写自动+1, 用来防止因回写顺序引起的回档
    @Version
    @Default("0")
    int dataVersion();

    @Column(name = "is_delete")
    @Nullable
    Boolean delete();
}
