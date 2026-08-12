// Last updated: 8/12/2026, 10:17:54 PM
import java.util.*;

class Solution {

    public int getLength(int[] nums) {

        int[] dremovical = nums;

        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {

            HashMap<Integer, Integer> freq = new HashMap<>();
            HashMap<Integer, Integer> cntFreq = new HashMap<>();

            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                int x = nums[j];

                int oldFreq = freq.getOrDefault(x, 0);

                if (oldFreq > 0) {
                    cntFreq.put(oldFreq, cntFreq.get(oldFreq) - 1);
                    if (cntFreq.get(oldFreq) == 0) {
                        cntFreq.remove(oldFreq);
                    }
                }

                int newFreq = oldFreq + 1;
                freq.put(x, newFreq);

                cntFreq.put(newFreq,
                        cntFreq.getOrDefault(newFreq, 0) + 1);

                maxFreq = Math.max(maxFreq, newFreq);

                int len = j - i + 1;

                if (isBalanced(len, freq.size(), maxFreq, cntFreq)) {
                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
    }

    private boolean isBalanced(int len, int distinct,
                           int maxFreq,
                           HashMap<Integer, Integer> cntFreq) {

    if (len == 1) return true;

    if (distinct == 1) return true;

    if (maxFreq % 2 != 0) return false;

    int half = maxFreq / 2;

    boolean hasMax = false;
    boolean hasHalf = false;

    for (int f : cntFreq.keySet()) {

        if (f == maxFreq) {
            hasMax = true;
        } else if (f == half) {
            hasHalf = true;
        } else {
            return false;
        }
    }

    return hasMax && hasHalf;
}
}