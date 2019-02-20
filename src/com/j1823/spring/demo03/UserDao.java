package com.j1823.spring.demo03;

import org.apache.ibatis.annotations.Select;

public interface UserDao {


    @Select("select * from user where id = #{id}")
    User findUser(int id);


}
