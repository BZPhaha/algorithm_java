package com.bzp.algorithm;

/**
 * by bzp
 * desc:插入排序算法实现。
 * 时间复杂度为：O(n^2) 空间复杂度为：O(1)
 */
public class InsertSort {
    public int[] sortfun(int[] sortarr){
        int n = sortarr.length;
        int[] resultarr = new int[n];
        resultarr[0] = sortarr[0];
        for(int i = 1;i < n;i++){
            int tmp = sortarr[i];
            int index = i;
            while(index > 0 && tmp <resultarr[index-1]){
                resultarr[index] = resultarr[index-1];
                index --;
            }
            resultarr[index] = tmp;
        }
        return resultarr;
    }
}
