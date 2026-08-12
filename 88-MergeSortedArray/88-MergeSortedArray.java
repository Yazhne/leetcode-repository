// Last updated: 8/12/2026, 10:27:27 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
      int index=0;
       for(int i=m; i<nums1.length; i++){
        
            nums1[i]=nums2[index];
            index++;
        
       }
       Arrays.sort(nums1);

    }
}