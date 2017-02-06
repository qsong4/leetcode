/**
 * Created by songqingyuan on 2/6/17.
 */
import java.util.*;
public class reconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
        });
        List<int[]> result = new LinkedList<>();
        for(int[] p:people){
            result.add(p[1],p);
        }
        return result.toArray(new int[people.length][]);
    }
}
