package com.bzp.leetcode;

//1,1,1,0,0,0,1,1,1,1,0
//滑动窗口思路  解决最大子集 leetcode 1004题
class BigChild {
    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int left = 0, lsum = 0, rsum = 0;
        int ans = 0;
        for (int right = 0; right < n; ++right) {
            rsum += 1 - A[right];
            while (lsum < rsum - K) {
                lsum += 1 - A[left];
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
    public static void main(String args[]){
        int[] tmp = {1,1,1,0,0,0,1,1,1,1,0,0,0,1};
        new BigChild().longestOnes(tmp,2);
    }
}