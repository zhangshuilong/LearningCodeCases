package com.itzhang.design.pattern.observer;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2512:59
 * @Descripton:
 */
public class Test {
    public static void main(String[] args) {
        UserFactory factory = new UserFactory();
        factory.add(new UserService("张三"));
        factory.add(new UserService("李四"));
        factory.update("米国攻打俄罗斯。。。");
    }
}
