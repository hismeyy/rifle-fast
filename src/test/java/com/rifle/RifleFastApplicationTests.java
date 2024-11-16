package com.rifle;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.rifle.userModule.system.user.domain.SysUser;
import com.rifle.userModule.system.user.mapper.SysUserMapper;
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
        sysUserMapper.insert(sysUser);
        QueryWrapper<SysUser> sysUserQueryWrapper = new QueryWrapper<SysUser>();
        System.out.println(sysUserMapper.selectList(sysUserQueryWrapper));
    }

    @Test
    void testId() {
        System.out.println(IdWorker.getId());
    }
}
