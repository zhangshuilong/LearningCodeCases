package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2321:19
 * @Descripton: 装饰者模式，装饰抽象类。
 */
public abstract class AbstractGarnish extends FastFood{
    private FastFood fastFood;

    public AbstractGarnish() {
    }

    public AbstractGarnish(FastFood fastFood,Integer price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
