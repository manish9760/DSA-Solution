class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(nums[i])){//true
        //         map.put(nums[i],map.get(nums[i])+1);
        //     }else {
        //         map.put(nums[i],1);
        //     }
        // }
        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                result.add(key);
            }
        }
        return result;
    }
}