/**
 * Created by songqingyuan on 1/31/17.
 */
import java.util.*;
public class findRadius {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int index = 0;
        int result = Integer.MIN_VALUE;

        for(int i=0;i<houses.length;i++){
            index = Arrays.binarySearch(heaters, houses[i]);
            if(index<0){
                index = -(index+1);
            }

            int distL = index>=1 ? houses[i]-heaters[index-1]:Integer.MAX_VALUE;
            int distR = index<heaters.length ? heaters[index]-houses[i]:Integer.MAX_VALUE;
            result = Math.max(result, Math.min(distL, distR));
        }
        return result;
    }
}
