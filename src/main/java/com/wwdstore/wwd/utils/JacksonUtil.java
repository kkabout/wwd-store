package com.wwdstore.wwd.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Jackson处理json xml工具类
 * @author kangjian03
 * @date 2019/7/8
 *
 */
public class JacksonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 防止反射调用构造器创建对象
     */
    private JacksonUtil() {
        throw new AssertionError();
    }

    /**
     * pojo转json
     *
     * @param obj pojo
     * @return json字符串
     */
    public static String pojo2Json(Object obj) {
        String jsonStr = "";
        try {
            jsonStr = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }
}
