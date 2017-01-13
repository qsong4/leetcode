/**
 * Created by songqingyuan on 1/13/17.
 */
import java.util.*;
public class boomertangs {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();
        int res=0;
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){

                if(i==j) continue;

                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0)+1);
            }

            for(int val:map.values()){
                res = res+val*(val-1);
            }
            map.clear();
        }
        return res;
    }

    private int getDistance(int[] a, int[] b){
        int dx = Math.abs(a[0]-b[0]);
        int dy = Math.abs(a[1]-b[1]);

        return dx*dx + dy*dy;
    }
}
