package com.itzhang.design.pattern.command;


/**
 * @Author: 张水龙
 * @Date: 2023/3/248:28
 * @Descripton: 命令模式，删除类
 */
public class Delete extends AbstractDatabase implements Command{
    @Override
    public void execute() {
        System.out.println("删除一条数据。。。。");
    }

    @Override
    public void rollback() {
        System.out.println("回滚删除的数据。。。。");
    }
}
