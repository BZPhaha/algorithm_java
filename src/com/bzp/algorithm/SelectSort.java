package com.bzp.algorithm;

/**
 * by bzp
 * desc:选择排序算法实现。  找到最小的 然后与排序后一个数进行交换位置。
 * 时间复杂度为：O(n^2) 空间复杂度为：不需要
 */
public class SelectSort {
    public int[] sortfun(int[] sortarr){
        int num = sortarr.length;
        for(int i=0;i < num;i++){
            int min = sortarr[i];
            int minindex = i;
            //遍历i之后的来进行大小比较 找到最小的
            for(int j = i + 1;j < num;j++){
                int tmp = sortarr[j];
                if(tmp < min){
                    min = tmp;
                    minindex = j;
                }
            }
            if(i != minindex){
                int tmp = sortarr[i];
                sortarr[i] = min;
                sortarr[minindex] = tmp;
            }
        }
        return sortarr;
    }
}