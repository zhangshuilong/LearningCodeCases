package com.itzhang.design.pattern.observer;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2512:54
 * @Descripton: 观察者具体实现类。
 */
public class UserService implements Observer{
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"跟新: "+message);
    }
}
