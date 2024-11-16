package com.rifle.userModule.project.userInfo.service;

import com.rifle.userModule.project.userInfo.domain.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> selectUserInfoList(UserInfo userInfo);

    UserInfo getUserInfo(Long userInfoId);

    Integer createUserInfo(UserInfo userInfo);

    Integer updateUserInfo(UserInfo userInfo);

    Integer deleteUserInfo(Long userInfoId);

    Integer saveUserInfo(UserInfo userInfo);

    Integer submitUserInfo(UserInfo userInfo);
}
