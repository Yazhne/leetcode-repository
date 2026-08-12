// Last updated: 8/12/2026, 10:22:10 PM
class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
        int n = nums.length;

        for (int i = 1; i <= n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                ans[0] = i;
            }

            if (count == 0) {
                ans[1] = i;
            }
        }

        return ans;
    }
}