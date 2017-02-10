/**
 * Created by songqingyuan on 2/10/17.
 */
import java.util.*;
public class topKfrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> l = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });

        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry = list.get(i);
            l.add(entry.getKey());
        }

        return l;
    }
}
