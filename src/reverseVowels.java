/**
 * Created by songqingyuan on 1/15/17.
 */
import java.util.*;
public class reverseVowels {

    public static void main(String[] arg){
        String result;
        result = reverseVowels("");
        System.out.println(result);
    }

    public static String reverseVowels(String s) {
        if(s==null||s==""||s==" "){
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(s);
        Set<String> vowels = new HashSet<>();
        vowels.add("a");
        vowels.add("o");
        vowels.add("u");
        vowels.add("i");
        vowels.add("e");

        int i=0;
        int j = result.length();
        while(i<=j){
            String p = result.substring(i,i+1);
            String l = result.substring(j-1,j);
            if(vowels.contains(p)&&vowels.contains(l)){
                result.replace(i,i+1,l);
                result.replace(j-1,j,p);
                i++;
                j--;
            }
            else if(vowels.contains(p)) j--;
            else if(vowels.contains(l)) i++;

            else {i++;j--;}
        }
        return result.toString();
    }
}
