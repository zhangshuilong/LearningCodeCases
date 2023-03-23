package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2321:16
 * @Descripton: 装饰者模式，炒面类。
 */
public class ChowMein extends FastFood{
    public ChowMein() {
        super(18,"炒面");
    }

    public Integer count() {
        return getPrice();
    }
}
