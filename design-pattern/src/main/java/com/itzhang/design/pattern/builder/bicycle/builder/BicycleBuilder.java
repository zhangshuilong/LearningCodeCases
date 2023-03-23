package com.itzhang.design.pattern.builder.bicycle.builder;

import com.itzhang.design.pattern.builder.bicycle.entity.Bicycle;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:12
 * @Descripton: 构造者模式，自行车构造类
 */
public class BicycleBuilder {

    private Bicycle bicycle;

    public BicycleBuilder() {
        this.bicycle =  new Bicycle();
    }

    public void chair(String chair){
        this.bicycle.setChair(chair);
    }

    public void frame (String frame){
        this.bicycle.setFrame(frame);
    }

    public void hub (String hub){
        this.bicycle.setHub(hub);
    }

    public Bicycle builder(){
        return this.bicycle;
    }
}
