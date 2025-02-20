class Solution {
    public int[] runningSum(int[] nums) {
        //int n = nums.length;
       
         for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];  // Update the current index with the sum
        }
        return nums;
    }
}