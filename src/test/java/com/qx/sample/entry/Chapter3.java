package com.qx.sample.entry;

import com.qx.sample.dao.IUserDao;
import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @description: 通过注解使用
 * @author: maker
 * @create: 2018/11/11
 */
public class Chapter3 {
    public static void main(String[] args) throws IOException {
        DaoUtil.CONFIG_FILE = "mybatis-config-3.xml";
        testGetAllUser();
    }

    private static void testGetAllUser() throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> lstUser = userDao.getAllUser();
        for (User user : lstUser) {
            System.out.println(user);
        }

    }
}
