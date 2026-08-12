// Last updated: 8/12/2026, 10:19:41 PM
class Solution {
    public int removePalindromeSub(String S) {
        if (S.length() == 0) return 0;
        for (int i = 0, j = S.length() - 1; i < j; i++, j--)
            if (S.charAt(i) != S.charAt(j)) return 2;
        return 1;
    }
}