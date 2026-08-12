// Last updated: 8/12/2026, 10:28:36 PM
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }

        // copy back to original array
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}