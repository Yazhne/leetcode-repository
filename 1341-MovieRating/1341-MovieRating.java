// Last updated: 8/22/2026, 3:16:23 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int l = 0;
4        int r = nums.length - 1;
5
6        while (l < r) {
7            int mid = l + (r - l) / 2;
8
9            if (nums[mid] < nums[r]) {
10                r = mid;
11            }
12            else if (nums[mid] > nums[r]) {
13                l = mid + 1;
14            }
15            else {
16                r--;
17            }
18        }
19
20        return nums[l];
21    }
22}