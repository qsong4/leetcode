package Medium;
import java.util.*;

/**
 * Created by songqingyuan on 5/8/17.
 */
public class findMinDiff {
    public int findMinDifference(List<String> timePoints) {
        boolean[] bac = new boolean[24*60];
        for(String time: timePoints){
            String[] tem = time.split(":");
            int h = Integer.parseInt(tem[0]);
            int m = Integer.parseInt(tem[1]);
            if(bac[h*60+m]) return 0;
            bac[h*60+m] = true;
        }

        int pre = 0;
        int min = Integer.MAX_VALUE;
        int first=0, last = 0;
        boolean flag = true;
        for(int i=0;i<bac.length;i++){
            if(bac[i]){
                if(!flag){
                    System.out.println(i-pre);
                    min = Math.min(min, i-pre);
                }
                if(flag){
                    first = i;
                    flag = false;
                }
                pre = i;
            }
        }
        min = Math.min(min, (24 * 60 - pre + first));

        return min;
    }
}
