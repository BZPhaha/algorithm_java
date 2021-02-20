package com.bzp.algorithm;

import java.util.Arrays;

public class Test {
    public static void main(String args[]){
        int[] tmp = {1,2,8,4,7,10,0};
        //判空
        if(tmp.length == 0) return;
        //冒泡排序测试
        //tmp = new BubbleSort().sortfun(tmp);
        //插入排序测试
        //tmp = new InsertSort().sortfun(tmp);
        //选择排序
        tmp = new SelectSort().sortfun(tmp);
        //输出结果
        System.out.println(Arrays.toString(tmp));
        /*for(int i = 0;i < tmp.length;i++){
            System.out.println(tmp[i]);
        }*/
    }
}