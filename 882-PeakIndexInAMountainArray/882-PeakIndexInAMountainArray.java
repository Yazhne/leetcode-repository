// Last updated: 8/12/2026, 10:21:02 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[peak]){
                peak=i;
            }
        }
        return peak;
        
    }
}