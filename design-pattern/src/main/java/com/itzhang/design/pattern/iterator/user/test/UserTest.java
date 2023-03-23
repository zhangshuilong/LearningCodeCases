package com.itzhang.design.pattern.iterator.user.test;

import com.itzhang.design.pattern.iterator.user.entity.User;
import com.itzhang.design.pattern.iterator.user.factory.imp.DefaultUserFactory;
import com.itzhang.design.pattern.iterator.user.iterator.UserIterator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:15
 * @Descripton: 测试
 */
public class UserTest {
    public static void main(String[] args) {
        DefaultUserFactory userFactory = new DefaultUserFactory();
        userFactory.add(new User("张三","123"));
        userFactory.add(new User("王五","123"));
        userFactory.add(new User("李四","123"));

        UserIterator iterator = userFactory.getIteratory();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
