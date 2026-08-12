// Last updated: 8/12/2026, 10:18:07 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count==2){
                int dup =1;
                for(int k=0;k<i;k++){
                    if(nums[i]==nums[k]){
                        dup=0;
                        break;
                    }
                }
                if(dup==1){
                    res=res^nums[i];

                }

                
            }
        
        }
        return res;
    }
}