package comg.itzhang.design.pattern.iterator.studnt.iterator;

import comg.itzhang.design.pattern.iterator.studnt.entity.Student;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2317:40
 * @Descripton: 迭代器模式，迭代接口
 */
public interface StudentIterator {
    boolean hashNext();
    Student next();
}
