package com.itzhang.design.pattern.singleton.entity;

/**
 * @Author: 张水龙
 * @Date: 2023/3/2319:45
 * @Descripton: 单例懒汉模式
 */
public class SingletonLazyBean {

    private static SingletonLazyBean singletonLazyBean;

    private SingletonLazyBean(){

    };

    public static SingletonLazyBean instance(){
       synchronized (SingletonLazyBean.class){
           if(singletonLazyBean == null){
               singletonLazyBean = new SingletonLazyBean();
           }
       }
        return singletonLazyBean;
    }
}
