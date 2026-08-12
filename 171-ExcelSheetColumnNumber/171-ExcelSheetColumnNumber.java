// Last updated: 8/12/2026, 10:25:58 PM
class Solution {
    public int titleToNumber(String c) {
        int a = 0;
        for(int i=0;i<c.length();i++){
            int b = c.charAt(i)-'A'+1;
            a=a*26+b;

        }
        return a;
    }
}