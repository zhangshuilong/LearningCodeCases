package com.itzhang.design.pattern.flyweight.traffic.factory;

import com.itzhang.design.pattern.flyweight.traffic.AbstractTraffic;
import com.itzhang.design.pattern.flyweight.traffic.imp.Automobile;
import com.itzhang.design.pattern.flyweight.traffic.imp.Metro;
import com.itzhang.design.pattern.flyweight.traffic.imp.Motorcycle;
import com.itzhang.design.pattern.flyweight.traffic.type.TrafficType;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2316:17
 * @Descripton: 享元模式，交通工厂类
 */
public class TrafficFactory {

    private Map<TrafficType, AbstractTraffic> trafficMap;

    public TrafficFactory() {
        this.trafficMap = new HashMap<TrafficType, AbstractTraffic>();
        this.trafficMap.put(TrafficType.AUTOMOBILE,new Automobile());
        this.trafficMap.put(TrafficType.METRO,new Metro());
        this.trafficMap.put(TrafficType.MOTORCYCLE,new Motorcycle());
    }

    public void ravel(TrafficType type){
        this.trafficMap.get(type).show();
    }
}
