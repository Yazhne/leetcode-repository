// Last updated: 8/12/2026, 10:18:45 PM
class Solution {
    public int pivotInteger(int n) {
        int tsum = (n*(n+1))/2;
        int lsum =0;
        int rsum =0;
        for(int i=1;i<=n;i++){
            lsum+=i;
            rsum=tsum-lsum+i;
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
        
    }
}