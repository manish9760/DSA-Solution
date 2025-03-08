class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        int maxIndex = 0;
        for(int i=0 ;i<n ; i++){
            if(nums[i]>largest){
                largest = nums[i];
                maxIndex = i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] != largest && largest < 2*nums[i]) return -1;
        }
        return maxIndex;
    }
}