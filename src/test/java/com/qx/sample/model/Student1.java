package com.qx.sample.model;

/**
 * @description:
 * @author: maker
 * @create: 2018/11/11
 */
public class Student1 {
    private int id;
    private String name;
    private Teacher1 teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher1 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher1 teacher) {
        this.teacher = teacher;
    }
}
