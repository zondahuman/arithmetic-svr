package com.abin.lee.arithmetic.list.ring;

/**
 * Created by abin on 2017/6/1 15:51.
 * arithmetic-svr
 * com.abin.lee.arithmetic.list.ring
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
