import java.util.*;
class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1&&k==1) return 0;
        int mid = (1 << (n - 2)); // 2 ki power n-2 means 2^n-1/2==2^n-2 //int mid = (Math.pow(2,n-1))/2;
        if(k<=mid) return kthGrammar(n-1,k);
        else return 1-(kthGrammar(n-1,k-mid));
    }
}