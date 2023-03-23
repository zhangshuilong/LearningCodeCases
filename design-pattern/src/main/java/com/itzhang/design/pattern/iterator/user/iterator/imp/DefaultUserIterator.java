package com.itzhang.design.pattern.iterator.user.iterator.imp;

import com.itzhang.design.pattern.iterator.user.entity.User;
import com.itzhang.design.pattern.iterator.user.iterator.UserIterator;

import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:02
 * @Descripton: 迭代器模式 用户迭代器具体实现类。
 */
public class DefaultUserIterator implements UserIterator {
    private List<User> users;
    private Integer index  = 0 ;

    public DefaultUserIterator() {
    }

    public DefaultUserIterator(List<User> users) {
        this.users = users;
    }

    public boolean hasNext() {
        return index < users.size();
    }

    public User next() {
        User user = users.get(index);
        index++;
        return user;
    }
}
