class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            char charFirst = s.charAt(l);
            char charLast = s.charAt(r);
            if(!Character.isLetterOrDigit(charFirst)) l++;
            else if(!Character.isLetterOrDigit(charLast)) r--;
            else{
                if(Character.toLowerCase(charFirst)!=Character.toLowerCase(charLast)) return false;
                l++;
            r--;
            }
            
        }
        return true;
    }
}