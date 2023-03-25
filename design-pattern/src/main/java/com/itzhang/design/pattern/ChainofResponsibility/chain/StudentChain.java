package com.itzhang.design.pattern.ChainofResponsibility.chain;

import com.itzhang.design.pattern.ChainofResponsibility.entity.Student;

/**
 * @Author: 张水龙
 * @Date: 2023/3/259:43
 * @Descripton: 学生责任链类
 */
public class StudentChain{
    private Student student;

    public StudentChain() {
        this.student = new Student();
    }

    public StudentChain(Student student) {
        this.student = student;
    }
    public StudentChain addStudentName(String studentName){
        this.student.setStudentName(studentName);
        return this;
    }

    public StudentChain addStudentSex(String studentSex){
        this.student.setStudentSex(studentSex);
        return this;
    }

    public Student getStudent(){
        return this.student;
    }
}
