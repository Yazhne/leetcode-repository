// Last updated: 8/22/2026, 3:03:50 PM
1public class Solution {
2    public int maxProduct(int[] A) {
3        if (A == null || A.length == 0) {
4            return 0;
5        }
6        int max = A[0], min = A[0], result = A[0];
7        for (int i = 1; i < A.length; i++) {
8            int temp = max;
9            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
10            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
11            if (max > result) {
12                result = max;
13            }
14        }
15        return result;
16    }
17}