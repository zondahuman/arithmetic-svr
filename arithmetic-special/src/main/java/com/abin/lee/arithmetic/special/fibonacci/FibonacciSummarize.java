package com.abin.lee.arithmetic.special.fibonacci;

/**
 * Created by abin on 2017/4/11 19:21.
 * arithmetic-svr
 * com.abin.lee.arithmetic.special.fibonacci
 */
public class FibonacciSummarize {

    public static void main(String[] args) {
        int input = 6 ;
        Integer result = fibonacci(input);
        System.out.println("result="+result);
        Integer result1 = dynamicFibonacci(input);
        System.out.println("result1="+result1);
    }

    /**
     * 1、1、2、3、5、8、13、21、……
     * @param n
     * @return
     */
    public static int fibonacci(int n){
        if(n==2 || n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }



    public static int dynamicFibonacci(int input){
        int one = 1 ;
        int two = 1;
        int temp = 0;
        for (int i = 3; i <= input ; i++) {
            temp = one + two;
            one = two;
            two = temp;
        }
        return temp;
    }

}
