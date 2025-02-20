class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        int last = nums.length-1;

        while(start<last){
            set.add(nums[start]+nums[last]);
            start++;
            last--;
        }
        return set.size();
    }
}