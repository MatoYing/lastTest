package com.zust.ysc012;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ysc012ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void test01() {
        String name = userDao.selectPassword("1");
        System.out.println(name);
    }

}
