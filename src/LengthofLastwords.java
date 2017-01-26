/**
 * Created by songqingyuan on 1/26/17.
 */
public class LengthofLastwords {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        if(a.length==0) return 0;
        return a[a.length-1].length();
    }
}
