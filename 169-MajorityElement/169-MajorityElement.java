// Last updated: 8/12/2026, 10:26:03 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len/2];
        
    }
}