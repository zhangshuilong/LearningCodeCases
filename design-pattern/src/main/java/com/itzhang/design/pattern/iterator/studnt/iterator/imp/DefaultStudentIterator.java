package com.itzhang.design.pattern.iterator.studnt.iterator.imp;

import com.itzhang.design.pattern.iterator.studnt.entity.Student;
import com.itzhang.design.pattern.iterator.studnt.iterator.StudentIterator;

import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2317:42
 * @Descripton: 迭代器模式，具体迭代器实现类。
 */
public class DefaultStudentIterator implements StudentIterator {

    private List<Student> students;
    private Integer index =0;

    public DefaultStudentIterator(List<Student> students) {
        this.students = students;
    }

    public boolean hashNext() {
        return index<students.size();
    }

    public Student next() {
        Student student = students.get(index);
        index++;
        return student;
    }
}
