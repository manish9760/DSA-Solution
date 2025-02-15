class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum = sum+ nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;
        int n = nums.length;
        int count = 0;
        int presum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++){
            presum = presum + nums[i];

            int remove = presum - k;
            count = count + map.getOrDefault(remove,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}