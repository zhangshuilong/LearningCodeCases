package com.itzhang.design.pattern.command;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:28
 * @Descripton: 命令模式，修改类
 */
public class Update extends AbstractDatabase implements Command{
    @Override
    public void execute() {
        System.out.println("修改数据。。。。");
    }

    @Override
    public void rollback() {
        System.out.println("回滚修改的数据");
    }
}
