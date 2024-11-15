package com.rifle.system.user.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rifle.common.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("sys_user")
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUser extends BaseEntity {

    @TableId
    private Long userId;

    private String username;

    private String password;

}
