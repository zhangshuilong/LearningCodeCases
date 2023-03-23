package com.itzhang.design.pattern.facade;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2322:36
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say(Status.ON);
    }
}
