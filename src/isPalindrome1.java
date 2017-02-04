/**
 * Created by songqingyuan on 2/4/17.
 */
public class isPalindrome1 {

    public static void main(String[] args){
        System.out.print(isPalindrome("aA"));
    }

    public static boolean isPalindrome(String s) {
        if(s==null) return false;
        String sr = s.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();
        System.out.print(sr);
        int i=0;
        int j=sr.length()-1;
        while(i<sr.length()&&j>=0){
            if(sr.charAt(i)!=sr.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
