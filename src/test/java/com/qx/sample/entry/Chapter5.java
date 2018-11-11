package com.qx.sample.entry;

import com.qx.sample.dao.UserDao;
import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 动态sql使用
 * @author: maker
 * @create: 2018/11/11
 */
public class Chapter5 {

    public static void main(String[] args) throws IOException {
        DaoUtil.CONFIG_FILE = "mybatis-config-2.xml";
        testDynamicSql();
    }

    public static void testDynamicSql() throws IOException {
        UserDao userDao = new UserDao();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "五");
        List<User> lstUser = userDao.getUserByDynamicSql(map);
        System.out.println("共" + lstUser.size() + "条");
        for (User user : lstUser) {
            System.out.println(user);
        }
    }
}
