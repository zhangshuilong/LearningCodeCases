package com.itzhang.design.pattern.iterator.studnt.factory.imp;

import com.itzhang.design.pattern.iterator.studnt.entity.Student;
import com.itzhang.design.pattern.iterator.studnt.iterator.StudentIterator;
import com.itzhang.design.pattern.iterator.studnt.iterator.imp.DefaultStudentIterator;
import com.itzhang.design.pattern.iterator.studnt.factory.StudentFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2317:49
 * @Descripton:
 */
public class DefaultStudentFactory implements StudentFactory {
    private List<Student> students = new ArrayList<Student>();

    public void add(Student student) {
        students.add(student);
    }

    public StudentIterator getIterator() {
        return new DefaultStudentIterator(students);
    }
}
