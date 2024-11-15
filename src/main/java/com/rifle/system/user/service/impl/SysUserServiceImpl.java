package com.rifle.system.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rifle.system.user.domain.SysUser;
import com.rifle.system.user.mapper.SysUserMapper;
import com.rifle.system.user.service.SysUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectSysUserList(SysUser sysUser) {
        QueryWrapper<SysUser> sysUserQueryWrapper = new QueryWrapper<>();
        return sysUserMapper.selectList(sysUserQueryWrapper);
    }

    @Override
    public SysUser getSysUserInfo(Long userId) {
        return sysUserMapper.selectById(userId);
    }

    @Override
    public Integer createSysUser(SysUser sysUser) {
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public Integer updateSysUser(SysUser sysUser) {
        return sysUserMapper.updateById(sysUser);
    }

    @Override
    public Integer saveSysUser(SysUser sysUser) {
        return null;
    }

    @Override
    public Integer submitSysUser(SysUser sysUser) {
        return null;
    }
}
