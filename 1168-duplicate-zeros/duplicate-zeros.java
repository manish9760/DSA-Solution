class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i,j;
        for(i=0 ; i<n ;i++){
            if(arr[i] == 0){
                for(j=n-1 ; j>i ; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}