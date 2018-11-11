package com.qx.sample.entry;

import com.qx.sample.dao.UserDao;
import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/10
 */
public class Chapter1 {
    public static void main(String[] args) throws IOException {
        DaoUtil.CONFIG_FILE = "mybatis-config-1.xml";
        // testSelectOne();
        testSelectAll();
        // testInsert();
        // testUpdate();
        // testDelete();
    }

    private static void testSelectOne() throws IOException {
        UserDao userDao = new UserDao();
        User user = userDao.getUserById("zhangshan");
        System.out.println(user);
    }

    private static void testSelectAll() throws IOException {
        UserDao userDao = new UserDao();
        List<User> lstUser = userDao.getAllUser();
        for(User user:lstUser){
            System.out.println(user);
        }
    }

    private static void testInsert() throws IOException {
        User swk = new User();
        swk.setId("sunwukong");
        swk.setName("孙悟空");
        swk.setPassword("44444");
        UserDao userDao = new UserDao();
        int n = userDao.addUser(swk);
        System.out.println(n);
    }
    private static void testUpdate() throws IOException {
        User swk = new User();
        swk.setId("sunwukong");
        UserDao userDao = new UserDao();
        int n = userDao.updateUser(swk);
        System.out.println(n);
    }

    private static void testDelete() throws IOException {
        String id = "sunwukong";
        UserDao userDao = new UserDao();
        int n = userDao.deleteUser(id);
        System.out.println(n);
    }
}
