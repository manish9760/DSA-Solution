class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                list.add(i);
            }
        }
        return list.size();
    }
}