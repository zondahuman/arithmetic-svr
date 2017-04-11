package com.abin.lee.arithmetic.sort.half;

/**
 * Created by abin on 2017/4/10 11:39.
 * arithmetic-svr
 * com.abin.lee.arithmetic.sort.half
 * http://www.cnblogs.com/coderising/p/5708632.html
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] input = new int[]{0,1,2,3,4,5,6,7,8,9};
        Integer target = 5;
        Integer result = cycleSearch(input, target);
        System.out.println("result="+result);
    }

    public static int cycleSearch(int[] input, int param){
        int low = 0;
        int middle = 0;
        int high = input.length-1;
        while(low<=high){
            middle = (low+high)/2;
            if(param == input[middle]){
                return middle+1;
            }else if(param > input[middle]){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] input, int low, int high, int param){
        if(low < high){
            int middle = (low+high)/2;
            if(input[middle] == param){
                return middle+1;
            }else if(input[middle] > param){
                return recursiveSearch(input,low,middle-1,param);
            }else{
                return recursiveSearch(input,low,middle-1,param);
            }
        }
        return -1;
    }


}
