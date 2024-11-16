-- ================================================================== 系统模块 ==========================================================================
-- ********************* 系统用户注册，登录模块 *********************
CREATE TABLE `sys_user`
(
    `user_id`      bigint                                                        NOT NULL COMMENT '用户ID',
    `username`     varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '用户名',
    `password`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
    `user_status`  tinyint(1) NOT NULL DEFAULT '0' COMMENT '用户状态：0使用 1禁用',
    `login_ip`     varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci          DEFAULT '' COMMENT '最后登录IP',
    `login_date`   datetime                                                               DEFAULT NULL COMMENT '最后登录时间',
    `created_by`   bigint                                                        NOT NULL COMMENT '创建人',
    `created_time` datetime                                                      NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`    bigint                                                                 DEFAULT NULL COMMENT '修改人',
    `update_time`  datetime                                                               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `remark`       text COMMENT '备注',
    `data_status`  tinyint(1) DEFAULT '1' COMMENT '数据状态：0草稿 1使用',
    `is_delete`    tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除：0否 1是',
    `tenant_id`    bigint                                                        NOT NULL COMMENT '租户Id',
    `version`      int                                                                    DEFAULT NULL COMMENT '版本号',
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='系统用户表';

-- ================================================================== 业务模块 ==========================================================================
-- ********************* 用户模块 *********************
CREATE TABLE `tb_user_info`
(
    `user_info_id` bigint   NOT NULL COMMENT '用户信息ID',
    `user_id`      bigint   NOT NULL COMMENT '用户ID',
    `nickname`     varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '昵称',
    `avatar`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '头像',
    `bio`          text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '个性签名',
    `name`         varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '姓名',
    `gender`       int                                                           DEFAULT NULL COMMENT '性别：0女 1男 2其他',
    `birth_year`   varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '出生年',
    `birth_month`  varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   DEFAULT NULL COMMENT '出生月',
    `birth_day`    varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   DEFAULT NULL COMMENT '出生日',
    `email`        varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '邮箱',
    `phone`        varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  DEFAULT NULL COMMENT '手机号',
    `address`      text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci COMMENT '地址',
    `created_by`   bigint   NOT NULL COMMENT '创建人',
    `created_time` datetime NOT NULL                                             DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`    bigint                                                        DEFAULT NULL COMMENT '修改人',
    `update_time`  datetime                                                      DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `remark`       text COMMENT '备注',
    `data_status`  tinyint(1) DEFAULT '1' COMMENT '数据状态：0草稿 1使用',
    `is_delete`    tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除：0否 1是',
    `tenant_id`    bigint   NOT NULL COMMENT '租户Id',
    `version`      int                                                           DEFAULT NULL COMMENT '版本号',
    PRIMARY KEY (`user_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户信息表';