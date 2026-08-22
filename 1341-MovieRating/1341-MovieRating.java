// Last updated: 8/22/2026, 3:01:34 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) 
3    {
4        int n = nums.length;
5        int count = 0;
6        int[] prefixSum = new int[n];
7
8        prefixSum[0] = nums[0];
9        for (int i = 1; i < n; i++)
10        {
11            prefixSum[i] = prefixSum[i - 1] + nums[i];
12        }
13
14        Map<Integer, Integer> m = new HashMap<>(); // PS, freq
15
16        for (int j = 0; j < n; j++)
17        {
18            if (prefixSum[j] == k) count++;
19
20            int val = prefixSum[j] - k;
21            if (m.containsKey(val))
22            {
23                count += m.get(val);
24            }
25
26            if (!m.containsKey(prefixSum[j]))
27            {
28                m.put(prefixSum[j], 0);
29            }
30            m.put(prefixSum[j], m.get(prefixSum[j]) + 1);
31        }
32
33        return count;
34    }
35}