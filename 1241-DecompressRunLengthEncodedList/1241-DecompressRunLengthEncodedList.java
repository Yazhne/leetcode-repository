// Last updated: 8/12/2026, 10:19:58 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int size = 0;
        for(int i = 0 ; i < nums.length ; i+= 2){
            int freq = nums[i];
            size += freq;
        }

        int[] ans = new int[size];
        int j = 0;
        for(int i = 0 ; i< nums.length ;i+= 2){
            int freq = nums[i];
            int val =  nums[i+1];

            while(freq > 0){
                ans[j++] = val;
                freq--;
            }
        }

        return ans;
    }
}