package com.itzhang.design.pattern.builder.car.test;

import com.itzhang.design.pattern.builder.car.builder.CarBuilder;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:02
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        builder.brand("帕加尼");
        builder.frame("碳纤维车架");
        builder.chair("真皮座椅");
        builder.hub("碳纤维轮毂");
        System.out.println(builder.builder());
    }
}
