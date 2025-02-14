class Solution {
    public boolean isPowerOfTwo(int n) {
        // for(int i=0;i<31;i++){
        //     long ans =(int) Math.pow(2,i);
        //     if(ans==n){
        //         return true;
        //     }
        // }
        // return false;



        // if(n<=0) return false;
        // else if(n==1) return true;
        // else return ((n%2==0) && isPowerOfTwo(n/2));  

        if(n<=0) return false;
        if(n==1) return true;
        while(n!=1){
            if(n%2!=0) return false;
            n = n/2;
        }
        return true;
    }
}