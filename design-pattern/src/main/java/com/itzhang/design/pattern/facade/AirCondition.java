package com.itzhang.design.pattern.facade;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2322:25
 * @Descripton: 外观模式，冰箱类
 */
public class AirCondition {
    public void on(){
        System.out.println("开冰箱。。。。");
    }
    public void off(){
        System.out.println("关冰箱。。。。");
    }
}
