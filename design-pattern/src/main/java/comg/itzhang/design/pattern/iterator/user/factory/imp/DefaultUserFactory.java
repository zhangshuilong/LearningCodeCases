package comg.itzhang.design.pattern.iterator.user.factory.imp;

import comg.itzhang.design.pattern.iterator.user.entity.User;
import comg.itzhang.design.pattern.iterator.user.factory.UserFactory;
import comg.itzhang.design.pattern.iterator.user.iterator.UserIterator;
import comg.itzhang.design.pattern.iterator.user.iterator.imp.DefaultUserIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:13
 * @Descripton: 学生工厂具体实现类
 */
public class DefaultUserFactory implements UserFactory{
    private List<User> users = new ArrayList<User>();

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
