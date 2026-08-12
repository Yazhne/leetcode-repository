// Last updated: 8/12/2026, 10:20:46 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]%2==0){
                left++;
            }
            else if(nums[right]%2!=0){
                right--;
            }
            else{
                int temp = nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
                right--;
            }
        }
        return nums;
        
    }
}