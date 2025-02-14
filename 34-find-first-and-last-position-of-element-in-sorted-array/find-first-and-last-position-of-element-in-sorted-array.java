
class Solution {
    public int firstOccurence(int[] nums,int target){
    int l=0;
    int r = nums.length-1;
    int ans=-1;
    while(l<=r){
        int mid = l + (r-l)/2;
        if(nums[mid]==target){
             ans = mid;
             r = mid-1;
        }
        if(target > nums[mid]){
            l = mid+1;
        }
        if(target<nums[mid]){
            r = mid-1;
        }
    }
    return ans;
}
public int lastOccurence(int[] nums,int target){
    int l=0;
    int r = nums.length-1;
    int ans=-1;
    while(l<=r){
        int mid = l + (r-l)/2;
        if(nums[mid]==target){
             ans = mid;
             l = mid+1;
        }
        if(target > nums[mid]){
            l = mid+1;
        }
        if(target<nums[mid]){
            r = mid-1;
        }
    }
    return ans;
}
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums,target);
        int last =lastOccurence(nums,target);
        return new int[] {first,last};
    }
    //return new int[]{-1,-1};
    
}