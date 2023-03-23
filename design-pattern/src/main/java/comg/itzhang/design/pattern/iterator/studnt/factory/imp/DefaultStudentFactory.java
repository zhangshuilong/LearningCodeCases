package comg.itzhang.design.pattern.iterator.studnt.factory.imp;

import comg.itzhang.design.pattern.iterator.studnt.entity.Student;
import comg.itzhang.design.pattern.iterator.studnt.factory.StudentFactory;
import comg.itzhang.design.pattern.iterator.studnt.iterator.StudentIterator;
import comg.itzhang.design.pattern.iterator.studnt.iterator.imp.DefaultStudentIterator;

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
