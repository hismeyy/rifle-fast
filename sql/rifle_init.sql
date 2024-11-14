CREATE TABLE `sys_user`
(
    `user_id`      bigint(20) NOT NULL COMMENT '用户ID',
    `username`     varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '用户名',
    `password`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '密码',
    `created_by`   bigint(20) NOT NULL COMMENT '创建人',
    `created_time` datetime NOT NULL                                             DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`    bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`  datetime                                                      DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `remark`       text COMMENT '备注',
    `data_status`  tinyint(1) NOT NULL DEFAULT '0' COMMENT '数据状态：0草稿 1使用',
    `is_delete`    tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除：0否 1是',
    `tenant_id`    bigint(20) NOT NULL COMMENT '租户Id',
    `version`      int(11) DEFAULT '1' COMMENT '版本号',
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='系统用户表';