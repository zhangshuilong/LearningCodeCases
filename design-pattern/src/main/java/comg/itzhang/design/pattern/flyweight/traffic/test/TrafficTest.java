package comg.itzhang.design.pattern.flyweight.traffic.test;

import comg.itzhang.design.pattern.flyweight.traffic.factory.TrafficFactory;
import comg.itzhang.design.pattern.flyweight.traffic.type.TrafficType;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2316:22
 * @Descripton: 测试
 */
public class TrafficTest {
    public static void main(String[] args) {
        TrafficFactory trafficFactory = new TrafficFactory();
        trafficFactory.ravel(TrafficType.AUTOMOBILE);
        trafficFactory.ravel(TrafficType.METRO);
        trafficFactory.ravel(TrafficType.MOTORCYCLE);
    }
}
