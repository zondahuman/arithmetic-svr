package com.abin.lee.arithmetic.sort.bubble;

import com.abin.lee.arithmetic.common.util.JsonUtil;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 17-4-11
 * Time: 下午9:09
 * To change this template use File | Settings | File Templates.
 */
public class BuddleSearch {
    public static void main(String[] args) {
        int[] input = new int[]{9,1,8,5,7,2,3,6,4};
        input = buddle(input);
        System.out.println("input=" + JsonUtil.toJson(input));
    }

    public static int[] buddle(int[] input){
        int temp=0;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }

            }
        }
        return input;
    }


}
