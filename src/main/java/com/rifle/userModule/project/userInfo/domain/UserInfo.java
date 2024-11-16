package com.rifle.userModule.project.userInfo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rifle.common.domain.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Schema(description = "用户信息对象")
@TableName("tb_user_info")
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInfo extends BaseEntity {

    @Schema(description = "用户信息ID")
    @TableId
    private Long userInfoId;

    @Schema(description = "用户信息ID")
    private Long userId;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "头像")
    private String avatar;

    @Schema(description = "个性签名")
    private String bio;

    @Schema(description = "姓名")
    private String name;

    @Schema(description = "性别：0女 1男 2其他")
    private Integer gender;

    @Schema(description = "出生年")
    private String birthYear;

    @Schema(description = "出生月")
    private String birthMonth;

    @Schema(description = "出生日")
    private String birthDay;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "手机号")
    private String phone;

    @Schema(description = "地址")
    private String address;

}
