package com.itzhang.design.pattern.facade;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2322:29
 * @Descripton: 外观模式，外观类。
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(Status status){
        switch (status){
            case ON:
                on();
                break;
            case OFF:
                off();
                break;
        }
    }

    private void off() {
        this.tv.off();
        this.airCondition.off();
        this.light.off();
    }

    private void on() {
        this.tv.on();
        this.light.on();
        this.airCondition.on();
    }
}
