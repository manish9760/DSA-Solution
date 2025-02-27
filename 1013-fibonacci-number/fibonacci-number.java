class Solution {
    // public static int fibbo(int n){
    //     if(n==0) return 0;
    //     if(n==1) return 1;
    //     else return fibbo(n-1) + fibbo(n-2);
    // }
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


        // int last = fibbo(n);
        // return last;

        if(n==0||n==1) return n;
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n+1;i++){
            arr[i]=-1;
        }
        return helper(arr,n);
        
    }
    int helper(int arr[],int n){
        if(arr[n]!=-1) return arr[n];
        else return arr[n] = helper(arr,n-1)+helper(arr,n-2);
    }
}