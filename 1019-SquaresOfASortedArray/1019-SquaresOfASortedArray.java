// Last updated: 8/12/2026, 10:20:25 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int sq[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sq[i] = (int)(Math.pow(nums[i],2));

        }
        Arrays.sort(sq);
        return sq;
        
    }
}