/**
 * Created by songqingyuan on 2/8/17.
 */
import java.util.*;
public class frequentSort {

    public static void main(String[] args){
        String a = frequencySort("tree");
        System.out.print(a);
    }

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length()-1;
        while(len>=0){
            map.put(s.charAt(len), map.getOrDefault(s.charAt(len), 0)+1);
            len--;
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });

        for(int i=0;i<list.size();i++){
            Map.Entry<Character, Integer> e = list.get(i);
            int j = e.getValue();
            while(j>0){
                System.out.println(e.getKey());
                sb.append(e.getKey());
                j--;
            }
        }

        return sb.toString();

    }
}
