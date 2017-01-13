/**
 * Created by songqingyuan on 1/13/17.
 */
import java.util.*;

public class repeatedString {

    public static void main(String[] arg){
        boolean fff = repeatedSubstringPattern("abaababaab");
        System.out.println(fff);
    }
    public static boolean repeatedSubstringPattern(String str) {

        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for (int i=len/2;i>0;i--){
            if(len%i==0){

                String sub = str.substring(0,i);
                for (int j=0;j<len/i;j++){
                    sb.append(sub);
                }

                if(sb.toString().equals(str)) return true;

            }
        }
        return false;

    }
}
