class Solution {
    public double minimumAverage(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        Arrays.sort(nums);
        double minAvg = Double.MAX_VALUE;
        while(l<r){
            double avg = (nums[l]+nums[r])/2.0;
            minAvg = Math.min(minAvg,avg);
            l++;
            r--;
        }
        return minAvg;
    }
}