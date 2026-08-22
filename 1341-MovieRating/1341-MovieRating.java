// Last updated: 8/22/2026, 2:24:05 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int n = arr.length;
4
5        if (n == 1) return 1;
6
7        int up = 1;
8        int down = 1;
9        int ans = 1;
10
11        for (int i = 1; i < n; i++) {
12
13            if (arr[i] > arr[i - 1]) {
14                up = down + 1;
15                down = 1;
16            }
17            else if (arr[i] < arr[i - 1]) {
18                down = up + 1;
19                up = 1;
20            }
21            else {
22                up = 1;
23                down = 1;
24            }
25
26            ans = Math.max(ans, Math.max(up, down));
27        }
28
29        return ans;
30    }
31}