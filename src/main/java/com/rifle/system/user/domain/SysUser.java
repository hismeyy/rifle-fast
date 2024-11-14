package com.rifle.system.user.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sys_user")
@Data
public class SysUser {
    @TableId
    private Long userId;
    private String username;
    private String password;
    private Integer isDeleted;
}
