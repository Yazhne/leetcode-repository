// Last updated: 8/12/2026, 10:24:33 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        int index =0;
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int count1 =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count1++;
                }
            }
            if(count1==1){
                res[index]=nums[i];
                index++;
            }
        }
        return res;
        
        
    }
}