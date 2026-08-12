// Last updated: 8/12/2026, 10:28:59 PM
class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 0;

            switch (s.charAt(i)) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }

            if (i < s.length() - 1) {
                int next = 0;

                switch (s.charAt(i + 1)) {
                    case 'I': next = 1; break;
                    case 'V': next = 5; break;
                    case 'X': next = 10; break;
                    case 'L': next = 50; break;
                    case 'C': next = 100; break;
                    case 'D': next = 500; break;
                    case 'M': next = 1000; break;
                }

                if (curr < next) {
                    total -= curr;
                } else {
                    total += curr;
                }
            } else {
                total += curr;
            }
        }

        return total;
    }
}