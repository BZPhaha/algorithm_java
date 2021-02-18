package com.bzp.algorithm;

import java.util.Arrays;

/**
 * by bzp
 * desc:冒泡排序算法实现。
 * 时间复杂度为：O(n^2) 空间复杂度为：O(1)
 */
public class BubbleSort {

    public int[] sortfun(int[] sortarr){
        int n = sortarr.length;
        for(int i = 1;i < n;i++){
            for(int j = 0;j < n-i;j++){
                if(sortarr[j] > sortarr[j+1]){
                    int temp = sortarr[j];
                    sortarr[j] = sortarr[j+1];
                    sortarr[j+1] = temp;
                }
            }
        }
        return sortarr;
    }
}
