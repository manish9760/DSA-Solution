class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int result = -1;
        for(int n:set){
            if(n>0 && set.contains(-n)){
                result = Math.max(n,result);
            }
        }
        return result;
    }
}