package com.itzhang.design.pattern.decorator;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2320:57
 * @Descripton: 装饰起模式，快餐类
 */
public abstract class FastFood {
    private Integer price;
    private String desc;

    public FastFood() {
    }

    public FastFood(Integer price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract Integer  count();
}
