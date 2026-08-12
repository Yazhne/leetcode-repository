// Last updated: 8/12/2026, 10:27:16 PM
class Solution{
    public int numTrees(int n) {
        int [] B = new int[n+1];
        B[0] = B[1] = 1;
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i;j++) {
                B[i] += B[j-1] * B[i-j];
            }
        }
        return B[n];
    }

}