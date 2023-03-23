package comg.itzhang.design.pattern.iterator.studnt.factory;

import comg.itzhang.design.pattern.iterator.studnt.entity.Student;
import comg.itzhang.design.pattern.iterator.studnt.iterator.StudentIterator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2317:47
 * @Descripton: 迭代模式，学生工厂接口类
 */
public interface StudentFactory {
    void add(Student student);
    StudentIterator getIterator();
}
