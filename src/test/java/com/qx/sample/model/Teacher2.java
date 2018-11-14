package com.qx.sample.model;

import java.util.List;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class Teacher2 {

    private int tid;
    private String name;
    private List<Student2> students;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student2> getStudents() {
        return students;
    }

    public void setStudents(List<Student2> students) {
        this.students = students;
    }
}
