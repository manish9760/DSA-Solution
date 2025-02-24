import java.util.*;
class Solution {
    public int kthGrammar(int n, int k) {
        // if(n==1&&k==1) return 0;
        // int mid = (1 << (n - 2)); 
        // if(k<=mid) return kthGrammar(n-1,k);
        // else return 1-(kthGrammar(n-1,k-mid));
        int l=1,ans=0;
        int h=(int)Math.pow(2,n-1);
        while(l<h){
            int mid = l+(h-l)/2;
            if(mid<k){
                l=mid+1;
                ans = 1-ans;
            }
            else{
                h = mid;
            }
        }
        return ans;
    }
}