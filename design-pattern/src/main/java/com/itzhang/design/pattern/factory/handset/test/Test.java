package com.itzhang.design.pattern.factory.handset.test;

import com.itzhang.design.pattern.factory.handset.Handset;
import com.itzhang.design.pattern.factory.handset.imp.Huawei;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:49
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        Handset handset = new Huawei();
        handset.show();
    }
}
