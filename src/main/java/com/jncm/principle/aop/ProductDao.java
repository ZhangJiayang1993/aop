package com.jncm.principle.aop;

public class ProductDao {

    public void save() {
        System.out.println("save");
    }

    public MyObject update() {
        System.out.println("update");
        return new MyObject("OK");
    }

    public MyObject delete() {
        System.out.println("delete");
        return new MyObject("deleteOK");
    }

    public void find() {
        System.out.println("find");
        throw new RuntimeException("故意的");
    }

}
