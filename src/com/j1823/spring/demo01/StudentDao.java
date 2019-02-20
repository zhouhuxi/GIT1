package com.j1823.spring.demo01;

import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDao {

    public void add() {
        System.out.println("添加");
    }

    public void remove(String temp) {
        System.out.println("删除");
    }


}
