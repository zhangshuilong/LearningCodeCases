package com.itzhang.design.pattern.facade;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2322:25
 * @Descripton: 外观模式，电灯类
 */
public class Light {
    public void on(){
        System.out.println("开灯。。。。");
    }
    public void off(){
        System.out.println("关灯。。。。");
    }
}
