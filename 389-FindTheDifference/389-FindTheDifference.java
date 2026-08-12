// Last updated: 8/12/2026, 10:23:41 PM
class Solution {
    public char findTheDifference(String s, String t) {
        
        int num = 0;

        for(int cs : s.toCharArray()) num -= cs;

        for(int ct : t.toCharArray()) num += ct;

        return (char) (num);
        
         }
}