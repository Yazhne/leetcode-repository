// Last updated: 8/12/2026, 10:22:35 PM
class Solution {
    public String reverseWords(String s) {
        String rev="";
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word=s.charAt(i)+word;
            }
            else{
                rev+=word+" ";
                word="";

            }
        }
        rev+=word;
        return rev;
        
    }
}