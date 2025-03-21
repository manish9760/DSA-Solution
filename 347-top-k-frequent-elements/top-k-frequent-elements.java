class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // TreeMap<Integer,Integer> map = new TreeMap<>();
        // for(int num: nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        //   List<Integer> list = new ArrayList<>(map.keySet());
        // list.sort((a, b) -> map.get(b) - map.get(a)); //Sort by Frequency in descending order   
        // int res[] = new int[k];
        // for (int i = 0; i < k; ++i)
        //     res[i] = list.get(i);
        // return res;

         Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.merge(i, 1, Integer::sum);//For Getting Frequency
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a)); //Sort by Frequency in descending order   
        int res[] = new int[k];
        for (int i = 0; i < k; ++i)
            res[i] = list.get(i);
        return res;

    }
}