// Last updated: 8/12/2026, 10:26:44 PM
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start=0;
        int last=s.length()-1;
    while(start<=last){
        char currfirst = s.charAt(start);
        char currlast = s.charAt(last);
        if(!Character.isLetterOrDigit(currfirst)){
            start++;
        }else if(!Character.isLetterOrDigit(currlast)){
            last--;
        }else{
            if(Character.toLowerCase(currfirst)!=Character.toLowerCase(currlast)){
                return false;
            }
            start++;
            last--;
        }

    }
    return true;

        
        
    }
}