package com.qiaoke.qiaoke;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoAppApplicationTests {

    @Test
    void contextLoads() {
        // 这是一个基础的上下文加载测试，默认由 Spring 生成
    }

    @Test
    void testHelloString() {
        // 编写一个简单的单元测试
        String result = "Hello Jenkins!";
        assertEquals("Hello Jenkins!", result);
    }
}