// Last updated: 8/12/2026, 10:28:23 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
        
    }
}