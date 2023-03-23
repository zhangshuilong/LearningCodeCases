package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2321:13
 * @Descripton: 装饰者模式，炒饭类
 */
public class FryRice extends FastFood{
    public FryRice() {
        super(22,"炒饭");
    }

    public Integer count() {
        return this.getPrice();
    }
}
