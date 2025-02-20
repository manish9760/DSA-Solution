class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long h = (int)Math.sqrt(c);
        while(l<=h){
            long sum = l*l + h*h;
            if(sum==c) return true;
            else if(sum<c) l++;
            else h--;
        }
        return false;
    }
}