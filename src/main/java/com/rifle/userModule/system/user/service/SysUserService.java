package com.rifle.userModule.system.user.service;

import com.rifle.userModule.system.user.domain.SysUser;

import java.util.List;

public interface SysUserService {
    List<SysUser> selectSysUserList(SysUser sysUser);

    SysUser getSysUserInfo(Long userId);

    Integer createSysUser(SysUser sysUser);

    Integer updateSysUser(SysUser sysUser);

    Integer deleteSysUser(Long userId);

    Integer saveSysUser(SysUser sysUser);

    Integer submitSysUser(SysUser sysUser);

}
