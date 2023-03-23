package com.itzhang.design.pattern.singleton.test;

import com.itzhang.design.pattern.singleton.entity.SingletonHungryBean;
import com.itzhang.design.pattern.singleton.entity.SingletonLazyBean;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:40
 * @Descripton: 测试
 */
public class SingletonTest {
    public static void main(String[] args) {
        //TODO 饿汉式单例
        SingletonHungryBean hungryBeanOne = SingletonHungryBean.instance();
        SingletonHungryBean hungryBeanTow = SingletonHungryBean.instance();
        System.out.println("----------------------饿汉式单例---------------------");
        System.out.println("hungryBeanOne和instanceTow实例是否相等: "+(hungryBeanOne == hungryBeanTow));

        //TODO 懒汉单例
        System.out.println("----------------------懒汉单例---------------------");
        SingletonLazyBean lazyBeanOne = SingletonLazyBean.instance();
        SingletonLazyBean lazyBeanTow = SingletonLazyBean.instance();
        System.out.println("lazyBeanOne和lazyBeanTow实例是否相等: "+(lazyBeanOne == lazyBeanTow));
    }
}
