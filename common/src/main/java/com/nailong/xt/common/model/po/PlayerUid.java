package com.nailong.xt.common.model.po;

import org.babyfish.jimmer.sql.Entity;
import org.babyfish.jimmer.sql.GeneratedValue;
import org.babyfish.jimmer.sql.GenerationType;
import org.babyfish.jimmer.sql.Id;
import org.jetbrains.annotations.Nullable;

/*
CREATE TABLE `player_uid` (
  `uid` int(10) unsigned AUTO_INCREMENT,
  `account_type` int(10) unsigned DEFAULT 0 COMMENT '账号类型',
  `account_uid` varchar(128) DEFAULT '' COMMENT '绑定的账号UID',
  `create_time` timestamp DEFAULT current_timestamp() COMMENT '创建时间',
  `ext` varchar(512) DEFAULT '' COMMENT '自定义信息，Json格式',
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE KEY `account_type_account_uid` (`account_type`,`account_uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='玩家身份信息表';
 */
@Entity
public interface PlayerUid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id();

    @Nullable
    Integer accountType();

    @Nullable
    Long accountUid();

    @Nullable
    String ext();
}
