/**
 * Created by songqingyuan on 11/9/16.
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arry =new int[26];
        for (int i = 0;i<magazine.length();i++){
            arry[magazine.charAt(i)-'a']++;
        }

        for (int j = 0;j<ransomNote.length();j++){
            arry[ransomNote.charAt(j)-'a']--;
            if (arry[ransomNote.charAt(j)-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
       System.out.print(canConstruct("aa", "aab"));
    }
}
