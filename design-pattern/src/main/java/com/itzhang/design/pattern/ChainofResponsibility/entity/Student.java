package com.itzhang.design.pattern.ChainofResponsibility.entity;

/**
 * @Author: 张水龙
 * @Date: 2023/3/259:39
 * @Descripton: 责任链模式，学生类
 */
public class Student {
    private String studentName;
    private String studentSex;

    public Student() {
    }

    public Student(String studentName, String studentSex) {
        this.studentName = studentName;
        this.studentSex = studentSex;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSex='" + studentSex + '\'' +
                '}';
    }
}
