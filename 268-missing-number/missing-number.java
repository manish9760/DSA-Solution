class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int Totalsum = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum = sum+ nums[i];
        }
        return Totalsum - sum;
    }
}