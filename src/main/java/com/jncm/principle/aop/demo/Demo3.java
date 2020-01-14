package com.jncm.principle.aop.demo;

import com.jncm.principle.aop.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aspectij.xml")
public class Demo3 {

    @Autowired
    private ProductDao productDao;

    @Test
    public void test1() {
//        productDao.find();
//        productDao.delete();
//        productDao.save();
//        System.out.println(productDao.update().getName());
        productDao.save();
    }

}
