class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max_count=0;
        int curr_count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                curr_count++;
                max_count = Math.max(curr_count,max_count);
            }else{
                curr_count=0;
            }
        }
        return max_count;
    }
}