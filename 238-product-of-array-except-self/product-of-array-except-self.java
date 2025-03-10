class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int i,j;
        int ans[] = new int[n];
        // for(i=0;i<n;i++){
        //     int res=1;
        //     for(j=0;j<n;j++){
        //         if(i==j) continue;
        //         res = res * nums[j];
        //     }
        //     ans[i] = res;
        // }
        // return ans;

        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(i=1;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(i=0;i<n;i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}