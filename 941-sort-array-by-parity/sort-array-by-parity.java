class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int num:nums){
        //     arr.add(num);
        // }
        // int index=0;
        // for(int i=0;i<arr.size();i++){
        //     if(arr[i] % 2==0){
        //         arr[index++]=arr[i];
        //     }
        // }
        // intk=0;
        // int[] result = new int[arr.size()];
        // for(int num: arr){
        //     result[k++] = num;
        // }
        // return result;
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]%2==0) left++;
            else if(nums[right]%2==1) right--;
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}