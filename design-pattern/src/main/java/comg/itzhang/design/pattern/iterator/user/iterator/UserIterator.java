package comg.itzhang.design.pattern.iterator.user.iterator;

import comg.itzhang.design.pattern.iterator.studnt.entity.Student;
import comg.itzhang.design.pattern.iterator.user.entity.User;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:01
 * @Descripton: 用户迭代器接口
 */
public interface UserIterator {
    boolean hasNext();
    User next();
}
