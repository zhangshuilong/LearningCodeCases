package com.itzhang.design.pattern.command;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:25
 * @Descripton: 命令模式，命令接口
 */
public interface Command {
    void  execute();
    void rollback();
}
