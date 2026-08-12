// Last updated: 8/12/2026, 10:28:31 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int num:nums){
            if(num!=val){
                nums[k]=num;
                k++;
            }
        }
        return k;
        
    }
}