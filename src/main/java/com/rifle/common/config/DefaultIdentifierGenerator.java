package com.rifle.common.config;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.stereotype.Component;

@Component
public class DefaultIdentifierGenerator implements IdentifierGenerator {

    private Long getId() {
        return IdUtil.getSnowflake().nextId();
    }

    @Override
    public Number nextId(Object entity) {
        return this.getId();
    }
}
