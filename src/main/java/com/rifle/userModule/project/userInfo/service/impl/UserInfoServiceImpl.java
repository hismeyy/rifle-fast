package com.rifle.userModule.project.userInfo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rifle.userModule.project.userInfo.domain.UserInfo;
import com.rifle.userModule.project.userInfo.mapper.UserInfoMapper;
import com.rifle.userModule.project.userInfo.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectUserInfoList(UserInfo userInfo) {
        QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
        return userInfoMapper.selectList(userInfoQueryWrapper);
    }

    @Override
    public UserInfo getUserInfo(Long userInfoId) {
        return userInfoMapper.selectById(userInfoId);
    }

    @Override
    public Integer createUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public Integer updateUserInfo(UserInfo userInfo) {
        return userInfoMapper.updateById(userInfo);
    }

    @Override
    public Integer deleteUserInfo(Long userInfoId) {
        return userInfoMapper.deleteById(userInfoId);
    }

    @Override
    public Integer saveUserInfo(UserInfo userInfo) {
        return null;
    }

    @Override
    public Integer submitUserInfo(UserInfo userInfo) {
        return null;
    }
}
