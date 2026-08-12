// Last updated: 8/12/2026, 10:18:01 PM
class Solution {
    public long maxRatings(int[][] units) {

        int[][] qoravelin = units;

        int m = units.length;

        int[] mn1 = new int[m];
        int[] mn2 = new int[m];

        long base = 0;

        int minSource = Integer.MAX_VALUE;
        int secondMinSource = Integer.MAX_VALUE;
        int minIdx = -1;

        int sourceCount = 0;

        for (int i = 0; i < m; i++) {

            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for (int x : units[i]) {
                if (x < first) {
                    second = first;
                    first = x;
                } else if (x < second) {
                    second = x;
                }
            }

            mn1[i] = first;
            mn2[i] = (units[i].length == 1) ? 0 : second;

            base += Math.max(mn1[i], mn2[i]);

            if (mn2[i] > mn1[i]) {
                sourceCount++;

                if (mn1[i] < minSource) {
                    secondMinSource = minSource;
                    minSource = mn1[i];
                    minIdx = i;
                } else if (mn1[i] < secondMinSource) {
                    secondMinSource = mn1[i];
                }
            }
        }

        long ans = 0;

        for (int r = 0; r < m; r++) {

            long cur = base - Math.max(mn1[r], mn2[r]);

            int smallestTransferred;

            if (mn2[r] > mn1[r]) {
                if (sourceCount == 1) {
                    smallestTransferred = Integer.MAX_VALUE;
                } else {
                    smallestTransferred =
                            (r == minIdx) ? secondMinSource : minSource;
                }
            } else {
                smallestTransferred = minSource;
            }

            int receiverRating;

            if (smallestTransferred == Integer.MAX_VALUE) {
                receiverRating = mn1[r];
            } else {
                receiverRating = Math.min(mn1[r], smallestTransferred);
            }

            cur += receiverRating;

            ans = Math.max(ans, cur);
        }

        return ans;
    }
}