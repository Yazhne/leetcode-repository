// Last updated: 8/12/2026, 10:23:00 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        return str.substring(1,str.length()-1).contains(s);
    }
}