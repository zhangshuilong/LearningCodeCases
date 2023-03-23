package com.itzhang.design.pattern.factory.fruit.test;

import com.itzhang.design.pattern.factory.fruit.Fruit;
import com.itzhang.design.pattern.factory.fruit.imp.Apple;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:40
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.show();
    }
}
