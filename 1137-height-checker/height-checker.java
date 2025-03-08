class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int newarray[] = new int[n];
        int i;
        for(i=0;i<n;i++){
            newarray[i] = heights[i];
        }
        Arrays.sort(newarray);
        int count=0;
        for(i=0;i<n;i++){
            if(newarray[i]==heights[i]) continue;
            else count++;
        }
        return count;
    }
}