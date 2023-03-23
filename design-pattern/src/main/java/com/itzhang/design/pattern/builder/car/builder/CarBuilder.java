package com.itzhang.design.pattern.builder.car.builder;

import com.itzhang.design.pattern.builder.car.entity.Car;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:56
 * @Descripton: 构造者模式，汽车构造类
 */
public class CarBuilder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public void brand(String brand){
        this.car.setBrand(brand);
    }

    public void chair(String chair){
        this.car.setChair(chair);
    }

    public void frame(String frame){
        this.car.setFrame(frame);
    }

    public void hub(String hub){
        this.car.setHub(hub);
    }

    public Car builder(){
        return this.car;
    }

}
