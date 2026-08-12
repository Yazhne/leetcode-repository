// Last updated: 8/12/2026, 10:18:24 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count =0;
        int f[] = new int[101];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;


        }
        int mf = 0;
        for(int i=0;i<f.length;i++){
            if(f[i]>mf){
                mf=f[i];
            }
        }
        int c =0;
        for(int i=0;i<f.length;i++){
            if(f[i]==mf){
                c+=f[i];
            }
        }
        return c;
        
        
    }
}