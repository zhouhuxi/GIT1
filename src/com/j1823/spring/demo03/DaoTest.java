package com.j1823.spring.demo03;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springMybatis.xml")
public class DaoTest {


    @Autowired
    @Qualifier("userDaoImpl")
    private UserDaoImpl userDao;

    @Test
    public void test() {

        User user = userDao.findUser(1000);
        System.out.println(user);

    }

}
