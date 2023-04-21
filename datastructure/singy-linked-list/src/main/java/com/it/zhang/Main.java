package com.it.zhang;

/**
 * @Author: 张水龙
 * @Date: 2023/4/2020:57
 * @class: Main
 * @Version: 1.0.0
 * @Descripton:
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinked<String> singlyLinked = new SinglyLinked<>();
        singlyLinked.add("张三");
        singlyLinked.add("李四");
        singlyLinked.add("王五");
        singlyLinked.add("赵六");


        System.out.println(singlyLinked.get(1));
    }
}
