// Last updated: 8/12/2026, 10:19:22 PM
import java.util.Arrays;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);
        
        int maxLength = -1;
        
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            
            if (firstIndex[charIndex] == -1) {
                firstIndex[charIndex] = i;
            } else {
                int currentLength = i - firstIndex[charIndex] - 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
}