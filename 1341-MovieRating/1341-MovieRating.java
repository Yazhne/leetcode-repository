// Last updated: 8/22/2026, 3:05:31 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        // Sort intervals based on start time
4        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
5
6        List<int[]> merged = new ArrayList<>();
7        int[] prev = intervals[0];
8
9        for (int i = 1; i < intervals.length; i++) {
10            // Overlap condition: current start <= previous end
11            if (intervals[i][0] <= prev[1]) {
12                // Merge intervals
13                prev[1] = Math.max(prev[1], intervals[i][1]);
14            } else {
15                // No overlap, add previous interval to result
16                merged.add(prev);
17                prev = intervals[i];
18            }
19        }
20
21        merged.add(prev); // Add the last interval
22        return merged.toArray(new int[merged.size()][]);
23    }
24}