package com.it.zhang;

/**
 * @Author: 张水龙
 * @Date: 2023/4/2516:24
 * @class: DoublyLinked
 * @Version: 1.0.0
 * @Descripton: 双向链表
 */
public class DoublyLinked<T> {

    /**
     * @Description: 正序
     **/
    private Node<T> firstNode;

    /**
     * @description: 最后倒序
     **/
    private Node<T> lastNode;

    private int size;

    public void add(T value){
        isNull(value);
        if (this.firstNode == null){
            this.firstNode = new Node<>(value,null,null);
            this.firstNode = new Node<>(value,null,null);
        }else {
            Node<T> old = this.firstNode;
            while (true){
                if(old.next == null){
                    old.next =  new Node<>(value, old,null);
                    old.prev =  new Node<>(value, null,old);
                    break;
                }else {
                    old = old.next;
                }
            }

        }
        size++;
    }

    /**
     * @Description: 判断添加的值是否为空
     * @Param: [value]
     * @return: void
     **/
    public void isNull(T value){
        if (value == null){
            throw new NullPointerException();
        }
    }

    private class Node<T>{

        //TODO 节点值
        private T value;

        //TODO 下一个节点
        private Node<T> next;

        //TODO 上一个
        private Node<T> prev;

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

}
