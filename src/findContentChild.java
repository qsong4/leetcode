/**
 * Created by songqingyuan on 1/11/17.
 */
import java.util.Arrays;
public class findContentChild {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=0;i<s.length&&count<g.length;i++){
            if(g[count]<=s[i]){
                count++;

            }
        }

        return count;
    }
}
