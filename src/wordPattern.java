/**
 * Created by songqingyuan on 1/25/17.
 */
import java.util.*;
public class wordPattern {
    public boolean wordPattern(String pattern, String str) {
        int[] pat = new int[128];
        String[] sss = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<sss.length;i++){
            map.put(sss[i], 0);
        }
        if(sss.length != pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            if(pat[pattern.charAt(i)] != map.get(sss[i])) return false;
            pat[pattern.charAt(i)] = i+1;
            map.put(sss[i], i+1);
        }

        return true;
    }
}
