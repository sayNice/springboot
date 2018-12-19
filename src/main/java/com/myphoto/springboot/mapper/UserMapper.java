package com.myphoto.springboot.mapper;

import com.myphoto.springboot.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user_table")
    public List<User> findUserAll();

    @Insert(" insert into user_table(username,password,age,year)" +
            " values(#{username},#{password},#{age},#{year}) ")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    public void insertUser(User user);
}
