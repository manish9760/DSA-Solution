class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){ // set me add kiya phle
            set.add(num);
        }
        if(set.size()<3) return Collections.max(set); // set ka size 3 se kam to max return kara diya
        set.remove(Collections.max(set));  // fir max1 and max2 ko remove kiya 
        set.remove(Collections.max(set));
        return Collections.max(set);  // remove karne ke bad max ko return kra diya
    }
}