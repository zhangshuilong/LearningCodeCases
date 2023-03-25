package com.itzhang.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2512:57
 * @Descripton: 被观察者类。
 */
public class UserFactory {
    private List<UserService> services = new ArrayList<>();

    public void add(UserService userService){
        services.add(userService);
    }

    public void update(String info){
        for (UserService service : services) {
            service.update(info);
        }
    }
}
