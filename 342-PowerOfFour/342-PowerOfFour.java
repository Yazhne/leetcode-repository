// Last updated: 8/12/2026, 10:24:02 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n/=4;
        }
        return n==1;
        
    }
}