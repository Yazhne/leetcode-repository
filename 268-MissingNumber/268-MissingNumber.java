// Last updated: 8/12/2026, 10:24:27 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        if(nums[nums.length-1]!=nums.length){
            return nums.length;
        }
        for(int i=1;i<nums.length;i++){
            if(i!=nums[i]){
                return i;

            }
        }
        return 0;

        
    }
}