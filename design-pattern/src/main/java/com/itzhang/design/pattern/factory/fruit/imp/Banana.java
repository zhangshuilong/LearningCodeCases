package com.itzhang.design.pattern.factory.fruit.imp;

import com.itzhang.design.pattern.factory.fruit.Fruit;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:37
 * @Descripton: 工厂模式，香蕉类
 */
public class Banana implements Fruit {
    public void show() {
        System.out.println("香蕉。。。。");
    }
}
