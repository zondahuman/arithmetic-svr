package com.abin.lee.arithmetic.list.reverse;



/**
 * Created by abin on 2017/5/17 17:02.
 * arithmetic-svr
 * com.abin.lee.arithmetic.list.reverse
 */

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
