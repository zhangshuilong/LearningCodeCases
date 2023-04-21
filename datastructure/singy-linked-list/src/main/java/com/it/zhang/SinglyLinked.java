package com.it.zhang;

/**
 * @Author: 张水龙
 * @Date: 2023/4/2020:41
 * @class: SingleLinked
 * @Version: 1.0.0
 * @Descripton: 单向链表数据接口
 */
public class SinglyLinked<T> {

    /**
     * @description: 第一个节点
     **/
    private Node<T> firstNode;


    /**
     * @description: 最后一个节点
     **/
    private Node<T> lastNode;

    /**
     *@description:链表长度
     **/
    private int size;

    public void add(T value) {
        //TODO 判断添加的值是否为空。
        isNull(value);
        //TODO 判断是否第一次添加数据
        if (this.firstNode == null) {
            this.firstNode = new Node<>(value,null);;
            this.lastNode = new Node<>(value,null);;
        } else {
            Node<T> oldNode = this.firstNode;
            while (true){
                if(oldNode.next == null){
                    oldNode.next = new Node<>(value,null);
                    this.lastNode = new Node<>(value,this.lastNode);
                    break;
                }else {
                    oldNode = oldNode.next;
                }
            }
        }
        size++;
    }

    public T get(Integer index){
        isNumber(index);
        Node<T> old = this.firstNode;
        if(index ==0){
            return old.value;
        }else{
            for (int i = 0; i < index; i++) {
                if(i == index-1){
                    return old.value;
                }else {
                    old = old.next;

                }            }
        }
        return null;
    }

    public void isNumber(Integer index){
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * @Description: 判断传入的值是否，是一个null值
     * @Param: [value]
     * @return: void
     **/
    public void isNull(T value){
        if (value == null){
            throw new NullPointerException();
        }
    }


    /**
     * @Author: 张水龙
     * @Date: 2023/4/2020:41
     * @class: Node
     * @Version: 1.0.0
     * @Descripton: 单向链表节点类
     */
    private class Node<T>{

        //TODO 节点值
        private T value;

        //TODO 下一个节点
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
