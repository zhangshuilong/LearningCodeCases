package com.itzhang.design.pattern.ChainofResponsibility;

import com.itzhang.design.pattern.ChainofResponsibility.chain.StudentChain;
import com.itzhang.design.pattern.ChainofResponsibility.entity.Student;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2510:08
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        StudentChain chain = new StudentChain();
        Student student = chain.addStudentName("张三").addStudentSex("男").getStudent();
        System.out.println(student);
    }
}
