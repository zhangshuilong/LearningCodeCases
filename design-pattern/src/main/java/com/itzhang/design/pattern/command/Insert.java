package com.itzhang.design.pattern.command;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:27
 * @Descripton: 命令模式，插入类
 */
public class Insert extends AbstractDatabase implements Command{

    private User user;

    public Insert() {
    }

    public Insert(User user) {
        this.user = user;
    }

    @Override
    public void execute() {
       add(this.user);
    }

    @Override
    public void rollback() {
        deleteInsert(this.user.getUserName());
    }
}
