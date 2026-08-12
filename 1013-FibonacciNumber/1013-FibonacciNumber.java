// Last updated: 8/12/2026, 10:20:26 PM
class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
        
    }
}