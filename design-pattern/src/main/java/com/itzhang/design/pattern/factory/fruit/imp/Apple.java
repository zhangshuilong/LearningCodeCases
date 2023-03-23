package com.itzhang.design.pattern.factory.fruit.imp;

import com.itzhang.design.pattern.factory.fruit.Fruit;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:35
 * @Descripton: 工厂模式，苹果类
 */
public class Apple implements Fruit {
    public void show() {
        System.out.println("苹果。。。。");
    }
}
