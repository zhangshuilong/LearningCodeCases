package com.itzhang.design.pattern.iterator.user.factory;

import com.itzhang.design.pattern.iterator.user.entity.User;
import com.itzhang.design.pattern.iterator.user.iterator.UserIterator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:07
 * @Descripton: 学生工厂接口类。
 */
public interface UserFactory {
    void add(User user);
    UserIterator getIteratory();
}
