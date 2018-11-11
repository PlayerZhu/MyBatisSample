package com.qx.sample.dao;

import com.qx.sample.model.Teacher2;
import com.qx.sample.util.DaoUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class TeacherDao {

    public Teacher2 getTeacher(int tid) throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        Teacher2 teacher = sqlSession.selectOne("com.qx.sample.model.teacher.mapper.getTeacherById",tid);
        sqlSession.close();
        return teacher;
    }
}
