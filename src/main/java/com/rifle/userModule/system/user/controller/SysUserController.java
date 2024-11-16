package com.rifle.userModule.system.user.controller;

import com.rifle.common.pojo.CommonResult;
import com.rifle.userModule.system.user.domain.SysUser;
import com.rifle.userModule.system.user.service.SysUserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.rifle.common.pojo.CommonResult.success;

@Tag(name = "系统用户Controller", description = "提供系统用户管理API")
@RestController
@RequestMapping("/sys/user/")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/getList")
    @Operation(summary = "获取系统用户列表", description = "获取系统用户列表")
    public CommonResult<List<SysUser>> getList(SysUser sysUser) {
        return success(sysUserService.selectSysUserList(sysUser));
    }

    @GetMapping("/getInfo/{userId}")
    @Operation(summary = "获取系统用户数据", description = "获取系统用户数据")
    public CommonResult<SysUser> getInfo(@PathVariable("userId") Long userId) {
        return success(sysUserService.getSysUserInfo(userId));
    }

    @PostMapping("/create")
    @Operation(summary = "创建系统用户数据", description = "创建系统用户数据")
    public CommonResult<Integer> create(@RequestBody SysUser sysUser) {
        return success(sysUserService.createSysUser(sysUser));
    }

    @PutMapping("/update")
    @Operation(summary = "更新系统用户数据", description = "更新系统用户数据")
    public CommonResult<Integer> update(@RequestBody SysUser sysUser) {
        return success(sysUserService.updateSysUser(sysUser));
    }

    @DeleteMapping("/delete/{userId}")
    @Operation(summary = "删除系统用户数据", description = "删除系统用户数据")
    public CommonResult<Integer> delete(@PathVariable("userId") Long userId) {
        return success(sysUserService.deleteSysUser(userId));
    }

    @PostMapping("/save")
    @Operation(summary = "保存系统用户数据", description = "保存系统用户数据")
    public CommonResult<Integer> save(@RequestBody SysUser sysUser) {
        return success(sysUserService.saveSysUser(sysUser));
    }

    @PostMapping("/submit")
    @Operation(summary = "提交系统用户数据", description = "提交系统用户数据")
    public CommonResult<Integer> submit(@RequestBody SysUser sysUser) {
        return success(sysUserService.submitSysUser(sysUser));
    }

}
