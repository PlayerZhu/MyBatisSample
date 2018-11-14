package com.qx.sample.dao;

import com.qx.sample.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public interface IUserDao {
    @Select("select id,name,pwd password from user")
    List<User> getAllUser();
}
