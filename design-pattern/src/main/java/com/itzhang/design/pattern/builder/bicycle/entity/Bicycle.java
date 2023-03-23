package com.itzhang.design.pattern.builder.bicycle.entity;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:10
 * @Descripton:构造者模式，自行车类。
 */
public class Bicycle {
    //TODO 座椅
    private String chair;
    //TODO 轮毂
    private String hub;
    //TODO 车架
    private String frame;

    public Bicycle() {
    }

    public Bicycle(String chair, String hub, String frame) {
        this.chair = chair;
        this.hub = hub;
        this.frame = frame;
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
        return "Bicycle{" +
                "chair='" + chair + '\'' +
                ", hub='" + hub + '\'' +
                ", frame='" + frame + '\'' +
                '}';
    }
}
