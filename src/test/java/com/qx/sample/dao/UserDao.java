package com.qx.sample.dao;

import com.qx.sample.model.User;
import com.qx.sample.util.DaoUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/10
 */
public class UserDao {

    public User getUserById(String id) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        User user = sqlSession.selectOne("com.qx.sample.model.UserMapper.selectUser", id);
        sqlSession.close();
        return user;
    }

    public User getUserById2(String id) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        User user = sqlSession.selectOne("com.qx.sample.model.UserMapper.selectUser2", id);
        sqlSession.close();
        return user;
    }

    public User getUserById3(String id) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        User user = sqlSession.selectOne("com.qx.sample.model.UserMapper.selectUser3", id);
        sqlSession.close();
        return user;
    }


    public List<User> getAllUser() throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        List<User> lstUser = sqlSession.selectList("com.qx.sample.model.UserMapper.selectAll");
        sqlSession.close();
        return lstUser;
    }

    public List<User> getUsersByPage1(Integer pageIndex, Integer pageSize) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        Integer startIndex = (pageIndex - 1) * pageSize;
        Map<String, Integer> map = new HashMap<>();
        map.put("startIndex", startIndex);
        map.put("pageSize", pageSize);
        List<User> lstUser = sqlSession.selectList("com.qx.sample.model.UserMapper.selectAllByPage1", map);
        sqlSession.close();
        return lstUser;
    }

    public List<User> getUsersByPage2(Integer pageIndex, Integer pageSize) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        Integer startIndex = (pageIndex - 1) * pageSize;
        RowBounds rowBounds = new RowBounds(startIndex, pageSize);
        List<User> lstUser = sqlSession.selectList("com.qx.sample.model.UserMapper.selectAllByPage2",
                null, rowBounds);
        sqlSession.close();
        return lstUser;
    }

    public int addUser(User user) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        int n = sqlSession.insert("com.qx.sample.model.UserMapper.insertUser", user);
        sqlSession.commit(); // !!!此处有坑
        sqlSession.close();
        return n;
    }

    public int updateUser(User user) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        int n = sqlSession.insert("com.qx.sample.model.UserMapper.updateUser", user);
        sqlSession.commit(); // !!!此处有坑
        sqlSession.close();
        return n;
    }

    public int deleteUser(String id) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        int n = sqlSession.insert("com.qx.sample.model.UserMapper.deleteUser", id);
        sqlSession.commit(); // !!!此处有坑
        sqlSession.close();
        return n;
    }

}
