class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum=0,i;
        double max = 0;
        for(i=0;i<k;i++){
            sum = sum + nums[i];
        }
        max = sum;
        for(i=k;i<n;i++){
            sum = sum + nums[i]- nums[i-k]; //remove leftmost and add rightmost
            max = Math.max(sum,max);
        }
        return max/k;
    }
}