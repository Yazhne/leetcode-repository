// Last updated: 8/12/2026, 10:28:02 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.split(" ");
        return arr[arr.length-1].length();
    }
}