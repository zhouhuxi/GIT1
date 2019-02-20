package com.j1823.spring.demo01;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentTest {


    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

    @Test
    public void testFun() {

        studentDao.add();

        System.out.println("------------------");

        studentDao.remove("test");

    }

}
