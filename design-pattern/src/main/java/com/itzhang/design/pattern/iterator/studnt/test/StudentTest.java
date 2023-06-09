package com.itzhang.design.pattern.iterator.studnt.test;

import com.itzhang.design.pattern.iterator.studnt.entity.Student;
import com.itzhang.design.pattern.iterator.studnt.iterator.StudentIterator;
import com.itzhang.design.pattern.iterator.studnt.factory.imp.DefaultStudentFactory;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2317:54
 * @Descripton:
 */
public class StudentTest {
    public static void main(String[] args) {
        DefaultStudentFactory studentFactory = new DefaultStudentFactory();
        studentFactory.add(new Student("张三","男"));
        studentFactory.add(new Student("李四","女"));
        studentFactory.add(new Student("王五","男"));

        StudentIterator iterator = studentFactory.getIterator();
        while (iterator.hashNext()){
            System.out.println(iterator.next());
        }
    }
}
