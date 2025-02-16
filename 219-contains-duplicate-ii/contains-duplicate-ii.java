class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int n= nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n&&j<=i+k;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        // }
        // return false;
        Map<Integer,Integer> hm = new HashMap<>();//key = nums, value = index
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
                int pastIndex= hm.get(nums[i]);
                if(Math.abs(pastIndex-i)<=k){
                    return true;
                }
                else{
                    hm.put(nums[i],i);
                }
            }
        }
        return false;
    }
}