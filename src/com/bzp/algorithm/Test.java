package com.bzp.algorithm;

public class Test {
    public static void main(String args[]){
        int[] tmp = {1,2,4,7,10,0};
        //判空
        if(tmp.length == 0) return;
        //冒泡排序测试
        tmp = new BubbleSort().sortfun(tmp);
        for(int i = 0;i < tmp.length;i++){
            System.out.println(tmp[i]);
        }
    }
}
