package com.cloud.provider;

import com.cloud.provider.controller.UserController;
import com.cloud.provider.service.UserService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;

@SpringBootTest
class UserServiceTests {

    private static Logger logger = LoggerFactory.getLogger(UserServiceTests.class);

    @Autowired
    private UserService userService;

    @Test
    public void test2() throws Exception {
        long start = System.currentTimeMillis();
         userService.doTaskOne();
         userService.doTaskTwo();
         userService.doTaskThree();
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

    @Test
    public void testFindAsyncB() throws Exception {
        userService.findAsyncB();
    }

}
