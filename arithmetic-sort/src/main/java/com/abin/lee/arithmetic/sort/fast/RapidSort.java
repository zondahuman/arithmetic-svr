package com.abin.lee.arithmetic.sort.fast;

import com.abin.lee.arithmetic.common.util.JsonUtil;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 17-4-12
 * Time: 上午12:07
 * To change this template use File | Settings | File Templates.
 * http://blog.csdn.net/yzllz001/article/details/50982841
 * http://www.cnblogs.com/coderising/p/5708801.html
 */
public class RapidSort {

    public static void main(String[] args) {
        int[] input = new int[]{9,1,8,5,7,2,3,6,4};
        sort(input,0 ,input.length-1);
        System.out.println("input=" + JsonUtil.toJson(input));
    }


    public static int partition(int[] input,int low, int high){
        int datum = input[low];
        while(low < high){
            while(input[high]>=datum && low < high)
                high--;
            input[low] = input[high];
            while(input[low] <= datum && low < high)
                low++;
            input[high] = input[low];
        }
        input[high] = datum;
        return high;
    }

    public static void sort(int[] input, int low, int high){
        if(low >=high)
            return;
        int index = partition(input,low,high);
        sort(input, low, index-1);
        sort(input,index+1,high);
    }

}
