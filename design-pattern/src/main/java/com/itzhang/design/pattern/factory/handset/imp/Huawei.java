package com.itzhang.design.pattern.factory.handset.imp;

import com.itzhang.design.pattern.factory.handset.Handset;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:46
 * @Descripton: 抽象工厂，华为类
 */
public class Huawei extends Handset {
    public void show() {
        System.out.println("买华为手机。。。。");
    }
}
