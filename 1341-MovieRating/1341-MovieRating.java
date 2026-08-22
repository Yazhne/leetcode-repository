// Last updated: 8/22/2026, 2:58:20 PM
1class Solution {
2
3    private int minSubarraySum(int[] nums){
4        int currSum = nums[0];
5        int minSum = nums[0];
6
7        for(int i = 1; i < nums.length; i++){
8            if(currSum > 0){
9                currSum = 0;
10            }
11
12            currSum += nums[i];
13            minSum = Math.min(currSum, minSum);
14        }
15
16        return minSum;
17    }
18
19    private int maxSubarraySum(int[] nums){
20        int currSum = nums[0];
21        int maxSum = nums[0];
22
23        for(int i = 1; i < nums.length; i++){
24            if(currSum < 0){
25                currSum = 0;
26            }
27
28            currSum += nums[i];
29            maxSum = Math.max(currSum, maxSum);
30        }
31
32        return maxSum;
33    }
34
35    public int maxSubarraySumCircular(int[] nums) {
36
37        if(nums.length == 0){
38            return 0;
39        }
40
41        // Check if all elements are negative
42        boolean x = true;
43        int ans = Integer.MIN_VALUE;
44
45        for(int i = 0; i < nums.length; i++){
46            if(nums[i] >= 0){
47                x = false;
48                break;
49            }
50
51            ans = Math.max(ans, nums[i]);
52        }
53
54        if(x){
55            return ans;
56        }
57
58        // Case 1: Maximum subarray does not wrap
59        int ans1 = maxSubarraySum(nums);
60
61        // Case 2: Maximum subarray wraps around
62        int arraySum = 0;
63
64        for(int i = 0; i < nums.length; i++){
65            arraySum += nums[i];
66        }
67
68        int ans2 = arraySum - minSubarraySum(nums);
69
70        return Math.max(ans1, ans2);
71    }
72}