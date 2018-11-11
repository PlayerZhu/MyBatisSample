package com.qx.sample.entry;

import com.qx.sample.dao.StudentDao;
import com.qx.sample.dao.TeacherDao;
import com.qx.sample.model.Student1;
import com.qx.sample.model.Student2;
import com.qx.sample.model.Teacher2;
import com.qx.sample.util.DaoUtil;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class Chapter4 {
    public static void main(String[] args) throws IOException {
        DaoUtil.CONFIG_FILE = "mybatis-config-4.xml";
        // testGetStudents();
        testGetTeacher();
    }

    private static void testGetStudents() throws IOException {
        StudentDao studentDao = new StudentDao();
        List<Student1> students = studentDao.getStudents();
        for (Student1 student : students) {
            System.out.println("id=" + student.getId() + ",name=" + student.getName()
                    + ",tid=" + student.getTeacher().getTid() + ",name=" + student.getTeacher().getName());
        }
    }

    private static void testGetTeacher() throws IOException {
        TeacherDao teacherDao = new TeacherDao();
        Teacher2 teacher = teacherDao.getTeacher(10001);
        System.out.println("teacher: " + teacher.getName());
        System.out.println("student: ");
        for (Student2 student : teacher.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
