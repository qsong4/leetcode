import java.util.ArrayList;

/**
 * Created by songqingyuan on 11/8/16.
 */
import java.util.Arrays;
public class findTheDifferent {
    public static char findTheDifference(String s, String t) {
        char[] a;
        char[] b;
        a = s.toCharArray();
        b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                return b[i];
            }

        }

        return b[b.length-1];
    }

    public static void main(String[] args){
        char result;
        result = findTheDifference("abcde","acdbef");
        System.out.print(result);
    }
}
