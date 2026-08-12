// Last updated: 8/12/2026, 10:21:11 PM
class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length()!=g.length()){
            return false;
        }
        return (s+s).contains(g);
        
    }
}