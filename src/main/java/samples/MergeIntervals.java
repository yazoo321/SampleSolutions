package samples;

import java.util.*;

public class MergeIntervals {
    private LinkedList<List<Integer>> uniqueIntervals = new LinkedList<>();

    public int[][] merge(int[][] intervals) {
        if (intervals == null) {
            return new int[0][0];
        }

        for (int[] interval : intervals) {
            checkOverlap(new ArrayList<>(List.of(interval[0], interval[1])));
        }

        return prepareResponse();
    }

    private void checkOverlap(List<Integer> current) {
        Iterator<List<Integer>> i = uniqueIntervals.iterator();
        while (i.hasNext()) {
            List<Integer> interval = i.next();
            if (requiresCombining(interval, current)) {
                current.set(0, Math.min(current.get(0), interval.get(0)));
                current.set(1, Math.max(current.get(1), interval.get(1)));

                i.remove();
            }
        }

        uniqueIntervals.add(current);
    }

    private boolean requiresCombining(List<Integer> interval, List<Integer> current) {
        return overlapOnLeft(interval, current)
                || overlapOnRight(interval, current)
                || encapsulatesInterval(interval, current);
    }

    private boolean overlapOnLeft(List<Integer> interval, List<Integer> current) {
        return interval.get(0) <= current.get(0) && current.get(0) <= interval.get(1);
    }

    private boolean overlapOnRight(List<Integer> interval, List<Integer> current) {
        return interval.get(1) >= current.get(1) && current.get(1) >= interval.get(0);
    }

    private boolean encapsulatesInterval(List<Integer> interval, List<Integer> current) {
        return current.get(0) <= interval.get(0) && current.get(1) >= interval.get(1);
    }


    private int[][] prepareResponse() {
        int[][] responseObject = new int[uniqueIntervals.size()][2];
        for (int i = 0; i < uniqueIntervals.size(); i++) {
            List<Integer> ui = uniqueIntervals.get(i);

            int[] interval = new int[2];
            interval[0] = ui.get(0);
            interval[1] = ui.get(1);

            responseObject[i] = interval;
        }

        return responseObject;
    }
}