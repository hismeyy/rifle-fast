package com.rifle.userModule.project.userInfo.controller;


import com.rifle.common.pojo.CommonResult;
import com.rifle.userModule.project.userInfo.domain.UserInfo;
import com.rifle.userModule.project.userInfo.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.rifle.common.pojo.CommonResult.success;

@Tag(name = "用户信息Controller", description = "提供用户信息管理API")
@RestController
@RequestMapping("/project/user-info/")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/getList")
    @Operation(summary = "获取用户信息列表", description = "获取用户信息列表")
    public CommonResult<List<UserInfo>> getList(UserInfo userInfo) {
        return success(userInfoService.selectUserInfoList(userInfo));
    }

    @GetMapping("/getInfo/{userInfoId}")
    @Operation(summary = "获取用户信息数据", description = "获取用户信息数据")
    public CommonResult<UserInfo> getInfo(@PathVariable("userInfoId") Long userInfoId) {
        return success(userInfoService.getUserInfo(userInfoId));
    }

    @PostMapping("/create")
    @Operation(summary = "创建用户信息数据", description = "创建用户信息数据")
    public CommonResult<Integer> create(@RequestBody UserInfo userInfo) {
        return success(userInfoService.createUserInfo(userInfo));
    }

    @PutMapping("/update")
    @Operation(summary = "更新用户信息数据", description = "更新用户信息数据")
    public CommonResult<Integer> update(@RequestBody UserInfo userInfo) {
        return success(userInfoService.updateUserInfo(userInfo));
    }

    @DeleteMapping("/delete/{userInfoId}")
    @Operation(summary = "删除用户信息数据", description = "删除用户信息数据")
    public CommonResult<Integer> delete(@PathVariable("userInfoId") Long userInfoId) {
        return success(userInfoService.deleteUserInfo(userInfoId));
    }

    @PostMapping("/save")
    @Operation(summary = "保存用户信息数据", description = "保存用户信息数据")
    public CommonResult<Integer> save(@RequestBody UserInfo userInfo) {
        return success(userInfoService.saveUserInfo(userInfo));
    }

    @PostMapping("/submit")
    @Operation(summary = "提交用户信息数据", description = "提交用户信息数据")
    public CommonResult<Integer> submit(@RequestBody UserInfo userInfo) {
        return success(userInfoService.submitUserInfo(userInfo));
    }

}
