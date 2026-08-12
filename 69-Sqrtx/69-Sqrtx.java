// Last updated: 8/12/2026, 10:27:47 PM
class Solution {
    public int mySqrt(int x) {
        long i =1;
        while(i*i <= x){
            i++;
        }
        return (int)i-1;
        
        
    }
}