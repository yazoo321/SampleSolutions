package samples;

public class MergeIntervals {
    private int[][] uniqueIntervals;
    private int itemsAdded = 0;

    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return new int[0][0];
        }
        uniqueIntervals = new int[intervals.length][2];

        for (int[] interval : intervals) {
            checkOverlap(interval);
        }

        return uniqueIntervals;
    }

    private void checkOverlap(int[] current) {
        for (int i = 0; i < itemsAdded; i++) {
            int[] interval = uniqueIntervals[i];

            if (overlapOnLeft(interval, current)) {
                interval[1] = current[1];
                break;
            }
            if (overlapOnRight(interval, current)) {
                interval[0] = current[0];
                break;
            }
        }

        // no overlap, this is a unique entry, add
        addEntry(current);
    }

    private boolean overlapOnLeft(int[] interval, int[] current) {
        return current[0] >= interval[0] && current[1] <= interval[1];
    }

    private boolean overlapOnRight(int[] interval, int[] current) {
        return current[0] <= interval[0] && current[1] >= interval[1];
    }

    private void addEntry(int[] interval) {
        uniqueIntervals[itemsAdded] = interval;
        itemsAdded++;
    }

}
