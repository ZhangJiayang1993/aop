package com.jncm.principle.aop.demo;


import com.jncm.principle.aop.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:aspectjXML.xml")
public class Demo4 {

    @Resource
    ProductDao productDao;

    @Test
    public void test1() {
        productDao.save();
        productDao.update();
    }

}
