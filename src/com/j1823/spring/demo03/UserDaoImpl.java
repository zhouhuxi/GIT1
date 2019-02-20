package com.j1823.spring.demo03;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userDaoImpl")
public class UserDaoImpl {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate template;

    public User findUser(int id) {
        UserDao mapper = template.getMapper(UserDao.class);
        return mapper.findUser(id);
    }
}
