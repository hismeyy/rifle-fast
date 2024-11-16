package com.rifle.userModule.system.user.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.rifle.common.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Schema(description = "系统用户对象")
@TableName("sys_user")
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends BaseEntity {

    @Schema(description = "用户ID")
    @TableId
    private Long userId;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "用户状态：0使用 1禁用")
    private Integer userStatus;

    @Schema(description = "最后登录IP")
    private String loginIp;

    @Schema(description = "最后登录时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime loginDate;

}
