package com.itzhang.design.pattern.singleton.entity;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:27
 * @Descripton: 单例饿汉模式
 */
public class SingletonHungryBean {

    private static SingletonHungryBean singletonHungryBean;
    private SingletonHungryBean(){
        throw new NullPointerException();
    }
    static {
        singletonHungryBean = new SingletonHungryBean();
    }

    public static SingletonHungryBean instance(){
        return singletonHungryBean;
    }

    public Object readResolve(){
        return singletonHungryBean;
    }

}
