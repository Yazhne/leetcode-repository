// Last updated: 8/12/2026, 10:19:53 PM
class Solution {
    public int dayOfYear(String date) {

        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int ans = day;

        for (int i = 0; i < month - 1; i++) {
            ans += days[i];
        }

        if (month > 2 && isLeap(year)) {
            ans++;
        }

        return ans;
    }

    private boolean isLeap(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}