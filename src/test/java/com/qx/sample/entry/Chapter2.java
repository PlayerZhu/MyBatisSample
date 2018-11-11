package com.qx.sample.entry;

import com.qx.sample.dao.UserDao;
import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class Chapter2 {
    public static void main(String[] args) throws IOException {

        DaoUtil.CONFIG_FILE = "mybatis-config-2.xml";

        // testPropColumn();

        testPage();
    }

    public static void testPage() throws IOException {
        int pageIndex = 1;
        int pageSize = 2;
        UserDao userDao = new UserDao();
        // List<User> lstUser = userDao.getUsersByPage1(pageIndex, pageSize);
        List<User> lstUser = userDao.getUsersByPage2(pageIndex, pageSize);
        for (User user : lstUser) {
            System.out.println(user);
        }
    }

    public static void testPropColumn() throws IOException {
        UserDao userDao = new UserDao();
        User user2 = userDao.getUserById2("zhangshan");
        System.out.println(user2);
        User user3 = userDao.getUserById3("zhangshan");
        System.out.println(user3);
    }
}
