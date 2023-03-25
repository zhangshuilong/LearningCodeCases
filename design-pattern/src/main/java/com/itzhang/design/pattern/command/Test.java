package com.itzhang.design.pattern.command;

import java.util.Date;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:31
 * @Descripton: 测试
 */
public class Test {
    public static void main(String[] args) {
      Command command = new Insert(new User("zhang","男"));
      command.execute();
      command.rollback();
    }
}
