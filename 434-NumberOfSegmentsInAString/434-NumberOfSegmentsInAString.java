// Last updated: 8/12/2026, 10:23:25 PM
class Solution {
    public int countSegments(String s) {
        char[]arr = s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '&& (i==0 || arr[i-1]==' ')){
                count++;
            }
        }
        return count;
        
    }
}