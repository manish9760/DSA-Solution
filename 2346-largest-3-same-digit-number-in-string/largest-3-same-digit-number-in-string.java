class Solution {
    public String largestGoodInteger(String num) {
      int n = num.length();
      String result = "";
      for(int i=2;i<n;i++){
        if(num.charAt(i)==num.charAt(i-1) && num.charAt(i-1)==num.charAt(i-2)){
            if(num.substring(i-2,i+1).compareTo(result)>0){
                result = num.substring(i-2,i+1);
            }
        }
      }
      return result;
    }
}