package com.qx.sample.dao;

import com.qx.sample.model.Student1;
import com.qx.sample.util.DaoUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class StudentDao {

    public List<Student1> getStudents() throws IOException {
        SqlSession sqlSession = DaoUtil.getSqlSession();
        List<Student1> lstStudent = sqlSession.selectList("com.qx.sample.model.student.mapper.getStudents");
        sqlSession.close();
        return lstStudent;
    }
}
