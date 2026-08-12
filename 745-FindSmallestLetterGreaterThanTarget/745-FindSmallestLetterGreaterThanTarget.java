// Last updated: 8/12/2026, 10:21:41 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char letter:letters){
            if(letter>target){
                return letter;
            }
        }
        return letters[0];
        
    }
}