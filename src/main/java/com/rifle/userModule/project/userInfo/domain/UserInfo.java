package com.rifle.userModule.project.userInfo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rifle.common.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("tb_user_info")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInfo extends BaseEntity {

    @TableId
    private Long userInfoId;

    private Long userId;

    private String nickname;

    private String avatar;

    private String bio;

    private String name;

    private Integer gender;

    private String birthYear;

    private String birthMonth;

    private String birthDay;

    private String email;

    private String phone;

    private String address;

}
