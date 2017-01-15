/**
 * Created by songqingyuan on 1/15/17.
 */
public class countSegment {

    public static void main(String[] arg){
        System.out.print(countSegments(""));
    }

    public static int countSegments(String s) {
        s= s.trim();
        if(s==null||s==""){
            return 0;
        }
        String[] sub = s.split(" ");
        return sub.length;
    }
}
