// Last updated: 8/12/2026, 10:19:51 PM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int f[] = new int[2001];
        for(int i=0;i<arr.length;i++){
            f[arr[i]+1000]++;


        }
        for(int i=0;i<f.length;i++){
            if(f[i]==0){
                continue;
            }
            for(int j=i+1;j<f.length;j++){
                if(f[i]==f[j]){
                    return false;
                }
            }
        }
        return true;
        
    }
}