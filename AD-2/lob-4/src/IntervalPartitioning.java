import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntervalPartitioning {
    public static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static int intervalPartitioning(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }
        // Sort intervals by end time
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });

        // Start with first interval
        int count = 1;
        int end = intervals.get(0).end;

        // Check if next interval overlaps with current end time
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= end) {
                count++;
                end = intervals.get(i).end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(5, 7));

        int partitions = intervalPartitioning(intervals);
        System.out.println("Minimum number of partitions required: " + partitions);
    }
}
