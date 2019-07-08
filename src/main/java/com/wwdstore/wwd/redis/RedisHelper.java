package com.wwdstore.wwd.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wwdstore.wwd.utils.JacksonUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author kangjian03
 * @date 2019/7/8
 */
@Component
public class RedisHelper {
    private StringRedisTemplate stringRedisTemplate;

    public <T> void putCache(String key,T t){
        String json = JacksonUtil.pojo2Json(t);
        stringRedisTemplate.opsForValue().set(key,json);
    }
}
