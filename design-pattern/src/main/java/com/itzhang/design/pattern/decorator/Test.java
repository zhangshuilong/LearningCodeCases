package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2321:30
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        FastFood fastFood = new FryRice();
        System.out.println(fastFood.getDesc()+fastFood.count());
        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc()+fastFood.count());
    }
}
