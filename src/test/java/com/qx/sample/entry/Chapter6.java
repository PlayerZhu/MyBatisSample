package com.qx.sample.entry;

import com.qx.sample.dao.UserDao;
import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: Oracle测试
 * @author: zhusm
 * @create: 2018/11/14
 */
public class Chapter6 {
    public static void main(String[] args) throws IOException {
        DaoUtil.CONFIG_FILE = "mybatis-config-5.xml";

        // testGetUser();

        testCallProc();
    }

    public static void testGetUser() throws IOException {
        UserDao userDao = new UserDao();
        User user = userDao.getUserById("zhangshan");
        System.out.println(user);
    }

    public static void testCallProc() throws IOException {
        UserDao userDao = new UserDao();
        Map<String, Object> map = new HashMap<>();
        map.put("user_id", "zhangshan");
        userDao.getUserPwdByProc(map);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
