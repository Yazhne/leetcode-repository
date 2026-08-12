// Last updated: 8/12/2026, 10:26:05 PM
class Solution {
    public String convertToTitle(int c) {
        StringBuilder s = new StringBuilder();
        while(c>0){
            c--;
            int rem = c%26;
            s.append((char)('A'+rem));
            c=c/26;
        }
        return s.reverse().toString();
        
    }
}