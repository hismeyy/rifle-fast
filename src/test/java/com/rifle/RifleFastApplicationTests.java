package com.rifle;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.rifle.system.user.domain.SysUser;
import com.rifle.system.user.mapper.SysUserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RifleFastApplicationTests {

    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testMapper() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("小天");
        sysUser.setPassword("123456");
        sysUser.setIsDeleted(0);
        sysUserMapper.insert(sysUser);
        QueryWrapper<SysUser> sysUserQueryWrapper = new QueryWrapper<SysUser>();
        System.out.println(sysUserMapper.selectList(sysUserQueryWrapper));
    }

    @Test
    void testId() {
        System.out.println(IdWorker.getId());
    }
}
