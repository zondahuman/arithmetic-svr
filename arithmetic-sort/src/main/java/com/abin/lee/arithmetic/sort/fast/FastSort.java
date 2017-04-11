package com.abin.lee.arithmetic.sort.fast;

import com.abin.lee.arithmetic.common.util.JsonUtil;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 17-4-11
 * Time: 下午9:59
 * To change this template use File | Settings | File Templates.
 * http://blog.csdn.net/yzllz001/article/details/50982841
 */
public class FastSort {
    public static void main(String[] args) {
        int[] input = new int[]{9,1,8,5,7,2,3,6,4};
        fast(input,0 ,input.length-1);
        System.out.println("input=" + JsonUtil.toJson(input));
    }

    /**
     * 快速排序的基本思想是：通过一趟排序将待排序的记录分隔成独立的两个部分，
     * 其中一部分记录的关键字均比另一部分记录的关键字小，接着分别对两部分分别进行同样的操作，最终得到有序的结果。
     * @return
     */
    public static void fast(int[] input, int low,int high){
        int start = low ;
        int end = high ;
        int temp = 0;
        int datum = input[low] ; //基准数

        while(start != end){
            while(input[end]>=datum && start<end)
                end--;
            while(input[start]<=datum && start<end)
                start++;
            if(start<end){
                temp = input[start];
                input[start] = input[end];
                input[end] = temp;
            }
        }
        input[low] = input[start];
        input[start] = datum;

        fast(input, low, start-1);
        fast(input, start+1, high);
    }


}
