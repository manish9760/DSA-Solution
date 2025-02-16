class Solution {
    public int removeDuplicates(int[] nums) {
        // int n = nums.length;
        // int i;
        // if(n==0) return 0;
        // int index=1;;
        // for(i=1;i<n;i++){
        //     if(nums[i]!=nums[i-1]){
        //         nums[index] = nums[i];
        //         index++;
        //     }
        // }
        // return index;
        int n = nums.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int k: nums){
            set.add(k);
        }
       // int result[] = new int[set.size()];
        int j=0;
        for(int num: set){
            nums[j++]= num;
        }
        return set.size();
        
    }
}