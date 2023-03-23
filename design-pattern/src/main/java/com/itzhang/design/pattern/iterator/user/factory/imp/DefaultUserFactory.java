package com.itzhang.design.pattern.iterator.user.factory.imp;

import com.itzhang.design.pattern.iterator.user.iterator.imp.DefaultUserIterator;
import com.itzhang.design.pattern.iterator.user.entity.User;
import com.itzhang.design.pattern.iterator.user.factory.UserFactory;
import com.itzhang.design.pattern.iterator.user.iterator.UserIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:13
 * @Descripton: 学生工厂具体实现类
 */
public class DefaultUserFactory implements UserFactory {
    private List<User> users = new ArrayList<User>();

    public DefaultUserFactory() {
    }

    public DefaultUserFactory(List<User> users) {
        this.users = users;
    }

    public void add(User user) {
        users.add(user);
    }

    public UserIterator getIteratory() {
        return new DefaultUserIterator(users);
    }
}
