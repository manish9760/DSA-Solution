class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxa = 0;
        int curra=0;
        for(int i=0 ;i<n;i++){
            curra = curra + gain[i];
            maxa = Math.max(maxa,curra);
            }
        return maxa;
    }
}