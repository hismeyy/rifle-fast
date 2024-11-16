package com.rifle.userModule.project.userInfo.controller;


import com.rifle.common.pojo.CommonResult;
import com.rifle.userModule.project.userInfo.domain.UserInfo;
import com.rifle.userModule.project.userInfo.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.rifle.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/project/user-info/")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/getList")
    public CommonResult<List<UserInfo>> getList(UserInfo userInfo) {
        return success(userInfoService.selectUserInfoList(userInfo));
    }

    @GetMapping("/getInfo/{userInfoId}")
    public CommonResult<UserInfo> getInfo(@PathVariable("userInfoId") Long userInfoId) {
        return success(userInfoService.getUserInfo(userInfoId));
    }

    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody UserInfo userInfo) {
        return success(userInfoService.createUserInfo(userInfo));
    }

    @PutMapping("/update")
    public CommonResult<Integer> update(@RequestBody UserInfo userInfo) {
        return success(userInfoService.updateUserInfo(userInfo));
    }

    @DeleteMapping("/delete/{userInfoId}")
    public CommonResult<Integer> delete(@PathVariable("userInfoId") Long userInfoId) {
        return success(userInfoService.deleteUserInfo(userInfoId));
    }

    @PostMapping("/save")
    public CommonResult<Integer> save(@RequestBody UserInfo userInfo) {
        return success(userInfoService.saveUserInfo(userInfo));
    }

    @PostMapping("/submit")
    public CommonResult<Integer> submit(@RequestBody UserInfo userInfo) {
        return success(userInfoService.submitUserInfo(userInfo));
    }

}
