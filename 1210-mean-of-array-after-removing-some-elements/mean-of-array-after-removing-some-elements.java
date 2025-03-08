class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int trim = (int) Math.ceil(n * 0.05);

        double sum = 0;
        int count=0;
        for(int i=trim;i<n-trim;i++){
            sum = sum+arr[i];
            count++;
        }
        return sum/count;
    }
}