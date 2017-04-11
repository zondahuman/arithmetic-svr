package com.abin.lee.arithmetic.sort.select;

import com.abin.lee.arithmetic.common.util.JsonUtil;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 17-4-11
 * Time: 下午9:45
 * To change this template use File | Settings | File Templates.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] input = new int[]{9,1,8,5,7,2,3,6,4};
        input = select(input);
        System.out.println("input=" + JsonUtil.toJson(input));
    }

    public static int[] select(int[] input){
        int temp=0;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    temp = input[j+1];
                    input[j+1] = input[j];
                    input[j] = temp;
                }

            }
        }
        return input;
    }




}
