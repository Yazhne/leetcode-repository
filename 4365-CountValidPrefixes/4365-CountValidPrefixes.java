// Last updated: 8/12/2026, 10:17:16 PM
class Solution {
    public int countValidPrefixes(String s) {
        int z=0;
        int o=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                z+=1;
            }
            else{
                o+=1;
            }
            if(Math.abs(z-o)<=1){
                ans+=1;
            }
        }
        return ans;
        
    }
}