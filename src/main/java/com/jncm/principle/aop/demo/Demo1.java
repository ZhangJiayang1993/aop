package com.jncm.principle.aop.demo;

import com.jncm.principle.aop.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

    @Test
    public void test1() {
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }

    @Test
    public void test2() {
        ProductDao productDao = new ProductDao();
        ProductDao proxy = (ProductDao) new MyCGLibProxy(productDao).createProxy();
        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();
    }

}
