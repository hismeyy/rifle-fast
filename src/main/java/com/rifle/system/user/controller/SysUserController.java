package com.rifle.system.user.controller;

import com.rifle.common.pojo.CommonResult;
import com.rifle.system.user.domain.SysUser;
import com.rifle.system.user.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.rifle.common.pojo.CommonResult.success;

@RestController
@RequestMapping("/sys/user/")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/getList")
    public CommonResult<List<SysUser>> getList(SysUser sysUser) {
        return success(sysUserService.selectSysUserList(sysUser));
    }

    @GetMapping("/getInfo/{userId}")
    public CommonResult<SysUser> getInfo(@PathVariable("userId") Long userId) {
        return success(sysUserService.getSysUserInfo(userId));
    }

    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody SysUser sysUser) {
        return success(sysUserService.createSysUser(sysUser));
    }

    @PutMapping("/update")
    public CommonResult<Integer> update(@RequestBody SysUser sysUser) {
        return success(sysUserService.updateSysUser(sysUser));
    }

    @DeleteMapping("/delete/{userId}")
    public CommonResult<Integer> delete(@PathVariable("userId") Long userId) {
        return success(sysUserService.deleteSysUser(userId));
    }

    @PostMapping("/save")
    public CommonResult<Integer> save(@RequestBody SysUser sysUser) {
        return success(sysUserService.saveSysUser(sysUser));
    }

    @PostMapping("/submit")
    public CommonResult<Integer> submit(@RequestBody SysUser sysUser) {
        return success(sysUserService.submitSysUser(sysUser));
    }


}
