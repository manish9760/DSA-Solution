class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int r = nums1.length;
        int c = nums2.length;
        int[] result = new int[r];
        for(int i = 0;i<r;i++){
            int index=-1;
            for(int j=0;j<c;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }
            result[i]=-1;
            for(int k=index+1;k<c;k++){
                if(nums2[k]>nums1[i]){
                    result[i]=nums2[k];
                    break;
                }
            }
        }
        return result;
    }
}