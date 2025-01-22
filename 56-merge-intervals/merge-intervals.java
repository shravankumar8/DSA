class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> merged = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!merged.isEmpty() && merged.get(merged.size() - 1)[1] >= start) {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], end);
            } else {
                merged.add(new int[] { start, end });
            }

        }
        return merged.toArray(new int[merged.size()][]);

    }
}