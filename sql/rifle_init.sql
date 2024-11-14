CREATE TABLE `sys_user`
(
    `user_id`    bigint(11) NOT NULL COMMENT '用户ID',
    `username`   varchar(50)                                                   NOT NULL COMMENT '用户名',
    `password`   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
    `is_deleted` int(1) DEFAULT '0' COMMENT '是否已删除（0: 否, 1: 是）',
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='系统用户表';