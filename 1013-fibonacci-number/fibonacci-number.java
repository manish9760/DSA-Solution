class Solution {
    public static int fibbo(int n){
        // if(n==0) return 0;
        // if(n==1) return 1;
        // else return fibbo(n-1)+fibbo(n-2);
        if(n==0) return 0;
        if(n==1) return 1;
        else return fibbo(n-1) + fibbo(n-2);
    }
    public int fib(int n) {
        // int n1=0,next_term;
        // int n2=1;
        // next_term = n1+n2;
        // if(n==0){
        // return 0;
        // }
        // for(int i=3;i<=n;i++){
        //     n1 = n2;
        //     n2 = next_term;
        //     next_term = n1+n2;
        // }
        // return next_term;


        int last = fibbo(n);
        return last;
    }
}