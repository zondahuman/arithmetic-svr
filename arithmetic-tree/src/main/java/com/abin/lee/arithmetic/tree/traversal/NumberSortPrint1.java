package com.abin.lee.arithmetic.tree.traversal;

/**
 * Created by abin on 2017/7/20 2017/7/20.
 * arithmetic-svr
 * com.abin.lee.arithmetic.tree.traversal
 */
public class NumberSortPrint1 {
    static final Object lock = new Object();
    public static void main(String[] args) {
        final Thread t1 = new Thread(new Runnable() {
            int i = -1;
            public void run() {
                while(i<99){
                    synchronized (lock){
                        System.out.println("Thread1: "+ Thread.currentThread().getName() +", "+ (i+=2));
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.setName("Thread1");
        t1.start();
        final Thread t2 = new Thread(new Runnable() {
            int i = 0;
            public void run() {
                while(i<99){
                    synchronized (lock){
                        System.out.println("Thread2: "+ Thread.currentThread().getName() +", "+ (i+=2));
                        lock.notifyAll();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.setName("Thread2");
        t2.start();
    }
}
