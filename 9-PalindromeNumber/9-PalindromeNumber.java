// Last updated: 8/12/2026, 10:29:04 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int o=x;
        int rev=0;
        while(x!=0){
            int digit =x%10;
            rev = rev*10+digit;
            x/=10;

        }
        if(o==rev){
            return true;
        }
        return false;
    }
}