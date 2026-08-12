// Last updated: 8/12/2026, 10:24:15 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0)return false;
            n=n/3;

        }return n==1;
    }
}