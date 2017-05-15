package Medium;
import java.util.Arrays;
import java.util.*;
/**
 * Created by songqingyuan on 5/15/17.
 */
public class findMinArrowShut {
    public int findMinArrowShots(int[][] points) {
        if(points==null || points.length==0) return 0;
        // sort points based on their end point.
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] p1, int[] p2)
            {
                return Integer.compare(p1[1],p2[1]);
            }
        });
        int currentEnd = points[0][1];
        int count = 1;
        for(int[] p: points)
        {
            // if the point starts after currentEnd, it means this balloons not been bursted. Then we shot the balloon in its end point. Otherwise, means this balloon has been bursted, then ignore it.
            if(p[0]>currentEnd) {
                count++;
                currentEnd = p[1];
            }
            else continue;
        }
        return count;
    }
}
