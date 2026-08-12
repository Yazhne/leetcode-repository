// Last updated: 8/12/2026, 10:24:35 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum =0;
            while(num>0){
                int d = num%10;
                sum=sum+d;
                num/=10;
            }
            num=sum;
            

        }
        return num;

        
    }
}