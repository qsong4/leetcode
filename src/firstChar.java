/**
 * Created by songqingyuan on 1/12/17.
 */

import java.util.*;

public class firstChar {

    public static void main(String[] arg){
        System.out.print(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        Map m = new HashMap();
        Set set = new HashSet();

        char[] str = s.toCharArray();

        for(int i=0;i<str.length;i++){
            if(m.containsKey(str[i])){
                int val = (int)m.get(str[i])+1;
                m.put(str[i], val);
            }
            else{
                m.put(str[i], 0);
            }
        }

        for(Object obj : m.keySet()){
            int value = Integer.parseInt(String.valueOf(m.get(obj)));
            if(value==0){
                set.add(obj);
            }
        }

        for(int i=0;i<str.length;i++){
            if(set.contains(str[i])){
                return i;
            }

        }

        return -1;
    }
}
