// Last updated: 8/12/2026, 10:23:39 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
       int i=0;
       int j=0;
       while(i<s.length()&& j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
            i++;
        }
        j++;
       }
       return i==s.length();

        
    }
}