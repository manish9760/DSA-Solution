class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>(); 
        for(int num:nums1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
      
        int[] resultarr = new int[set2.size()];
        int i=0;
        for(int num:set2){
            resultarr[i++]=num;
        }
        return resultarr;
    }
}
//step1: first i add all elements to set1 which is unique of nums1
//Step2: then i check that if nums2 elements exists in set than i add them to set 2
//Step3: then i store the set element to array of result and return the result