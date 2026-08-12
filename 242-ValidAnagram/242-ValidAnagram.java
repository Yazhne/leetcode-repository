// Last updated: 8/12/2026, 10:24:43 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        char s1 [] = s.toCharArray();
        char s2 [] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}