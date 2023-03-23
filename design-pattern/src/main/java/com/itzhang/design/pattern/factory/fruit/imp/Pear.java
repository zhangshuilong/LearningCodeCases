package com.itzhang.design.pattern.factory.fruit.imp;

import com.itzhang.design.pattern.factory.fruit.Fruit;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:36
 * @Descripton: 工厂模式，梨类
 */
public class Pear implements Fruit {
    public void show() {
        System.out.println("香梨。。。。");
    }
}
