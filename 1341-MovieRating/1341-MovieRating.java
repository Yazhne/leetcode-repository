// Last updated: 8/22/2026, 2:59:46 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4        int n = nums.length;
5        int[] res = new int[n];
6
7        int pre = 1;
8
9        for(int i = 0; i < n; i++){
10            res[i] = pre;
11            pre *= nums[i];
12        }
13
14        int suf = 1;
15
16        for(int i = n - 1; i >= 0; i--){
17            res[i] *= suf;
18            suf *= nums[i];
19        }
20
21        return res;
22    }
23}