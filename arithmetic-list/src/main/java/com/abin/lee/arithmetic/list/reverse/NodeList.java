package com.abin.lee.arithmetic.list.reverse;

/**
 * Created by abin on 2017/5/17 17:05.
 * arithmetic-svr
 * com.abin.lee.arithmetic.list.reverse
 * http://blog.csdn.net/guyuealian/article/details/51119499
 */
public class NodeList {

    public static Node cycleReverse(Node head) {
        if (null == head)
            return head;
        Node pre = head;
        Node cur = head.getNext();
        Node temp = null;
        while (cur != null) {
            temp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = temp;
        }
        head.setNext(null);
        return pre;
    }

    public static Node recursiveReverse(Node head) {
        if (null == head || head.getNext() == null)
            return head;
        Node reHead = recursiveReverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return reHead;
    }



    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }
        // 调用反转方法
         head = recursiveReverse(head);
//        head = cycleReverse(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }


}
