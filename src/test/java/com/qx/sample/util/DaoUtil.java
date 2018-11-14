package com.qx.sample.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/10
 */
public class DaoUtil {

    public static String CONFIG_FILE;

    public static SqlSessionFactory getSessionFactory() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream(CONFIG_FILE);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory = getSessionFactory();
        return sqlSessionFactory.openSession();
    }

}
