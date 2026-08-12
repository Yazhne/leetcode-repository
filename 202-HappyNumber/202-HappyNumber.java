// Last updated: 8/12/2026, 10:25:29 PM
class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            int sum =0;
            while(n>0){
                int d = n%10;
                sum+=d*d;
                n/=10;

            }
            n=sum;
            
            
        }
        if(n==1){
            return true;
        }
        return false;
    }
        
}