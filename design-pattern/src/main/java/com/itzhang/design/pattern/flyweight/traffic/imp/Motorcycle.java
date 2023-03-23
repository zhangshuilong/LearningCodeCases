package com.itzhang.design.pattern.flyweight.traffic.imp;

import com.itzhang.design.pattern.flyweight.traffic.AbstractTraffic;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2316:13
 * @Descripton: 享元模式，摩托类实现交通接口类
 */
public class Motorcycle implements AbstractTraffic {
    public void show() {
        System.out.println("我还是骑摩托车上班把。。。。。");
    }
}
