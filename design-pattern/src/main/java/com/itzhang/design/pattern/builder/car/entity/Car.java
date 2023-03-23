package com.itzhang.design.pattern.builder.car.entity;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2318:52
 * @Descripton: 构造者模式，汽车类
 */
public class Car {
    //TODO 品牌
    private String brand;
    //TODO座椅
    private String chair;
    //TODO 轮毂
    private String hub;
    //TODO 车架
    private String frame;

    public Car() {
    }

    public Car(String brand, String chair, String hub, String frame) {
        this.brand = brand;
        this.chair = chair;
        this.hub = hub;
        this.frame = frame;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", chair='" + chair + '\'' +
                ", hub='" + hub + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }
}
