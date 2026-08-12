// Last updated: 8/12/2026, 10:17:46 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int sum =0;
        int ssum=0;
        while(n>0){
            int di = n%10;
            sum = sum+di;
            ssum=ssum+di*di;
            n=n/10;
        }
        if(ssum-sum>=50){
            return true;
        }
        return false;
    }
}