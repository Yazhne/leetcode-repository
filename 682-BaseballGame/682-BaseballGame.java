// Last updated: 8/12/2026, 10:21:59 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                s.pop();
            }

            else if (op.equals("D")) {
                s.push(2 * s.peek());
            }

            else if (op.equals("+")) {
                int top = s.pop();
                int newScore = top + s.peek();
                s.push(top);
                s.push(newScore);
            }

            else {
                s.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int val : s) {
            sum += val;
        }

        return sum;
    }
}