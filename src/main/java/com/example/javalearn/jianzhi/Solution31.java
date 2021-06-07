package com.example.javalearn.jianzhi;

public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cur=n%10;
        int high=n/10;
        int low=0;
        int digit=1;
        int res=0;
        while (high!=0 || cur!=0){
            if (cur==0){
                res += high*digit;
            }else if (cur==1){
                res += high*digit+low+1;
            }else {
                res +=(high+1)*digit;
            }
            digit *=10;
            cur = high%10;
            high = high/10;
            low = n%digit;
        }
        return res;
    }
}
