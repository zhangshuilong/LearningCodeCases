package com.itzhang.design.pattern.builder.bicycle.test;

import com.itzhang.design.pattern.builder.bicycle.builder.BicycleBuilder;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:15
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        BicycleBuilder bicycleBuilder = new BicycleBuilder();
        bicycleBuilder.chair("真皮座椅");
        bicycleBuilder.frame("碳纤维车架");
        bicycleBuilder.hub("镁合金轮毂");
        System.out.println(bicycleBuilder.builder());
    }
}
