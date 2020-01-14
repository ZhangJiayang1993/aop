package com.jncm.principle.aop.demo;

import com.jncm.principle.aop.ProductDao;
import com.jncm.principle.aop.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Demo2 {
    @Resource
    private UserDao userDao;

    @Resource
    private ProductDao productDao;

    @Test
    public void test1() {
        userDao.find();
        userDao.update();
        userDao.delete();
        userDao.save();
    }

    @Test
    public void test2() {
        productDao.find();
        productDao.update();
        productDao.delete();
        productDao.save();
    }

    public void test3() {
        //JdkRegexpMethodPointcut 构造正则表达式切点
    }

}
