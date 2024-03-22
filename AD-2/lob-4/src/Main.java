
import java.util.*;

class Interval implements Comparable<Interval> {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Interval o) {
        return this.end - o.end;
    }
}

public class Main {

    public static int scheduleTasks(Interval[] intervals) {
        Arrays.sort(intervals);

        int count = 1;
        int end = intervals[0].end;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                count++;
                end = intervals[i].end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1, 3),
                new Interval(2, 4),
                new Interval(3, 6),
                new Interval(5, 7),
                new Interval(8, 10)
        };

        System.out.println("Maximum number of tasks that can be scheduled without overlapping: " + scheduleTasks(intervals));
    }
}
