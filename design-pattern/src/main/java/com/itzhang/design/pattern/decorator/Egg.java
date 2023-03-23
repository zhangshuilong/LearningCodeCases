package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2321:24
 * @Descripton: 鸡蛋类
 */
public class Egg extends AbstractGarnish{
    public Egg(FastFood fastFood){
        super(fastFood,1,"鸡蛋");
    }
    public Integer count() {
        return getPrice()+getFastFood().count();
    }
}
