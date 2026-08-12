// Last updated: 8/12/2026, 10:23:47 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;

        for (int i = 1; i <= num / 2; i++) {
            if ((long)i * i == num)
                return true;
            if ((long)i * i > num)
                break;
        }

        return false;
    }
}