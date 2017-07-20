package com.abin.lee.arithmetic.tree.traversal;

/**
 * Created by abin on 2017/7/20 2017/7/20.
 * arithmetic-svr
 * com.abin.lee.arithmetic.tree.traversal
 */
public class NumberSortPrint {
    public static void main(String[] args) {
        final Object lock = new Object();
        final Thread t1 = new Thread(new Runnable() {
            int i = 1;
            public void run() {
                while(true){
                    if(i>100) break;
                    synchronized (lock){
                        i+=2;
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
        final Thread t2 = new Thread(new Runnable() {
            int i = 0;
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while(true){
                    if(i>100) break;
                    synchronized (lock){
                        System.out.println(i);
                        if(i==0) t1.start();
                        i+=2;
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
        t2.start();
    }


}
