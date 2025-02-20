class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double sum = 0;
        int count=0;
        for(int i=1;i<n-1;i++){
            sum = sum+salary[i];
            count++;
        }
        if(count==0) return 0;
        else return sum/(count*1.0);
    }
}