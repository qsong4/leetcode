/**
 * Created by songqingyuan on 11/5/16.
 */
public class ReverseString {
    public static String reverseString(String s) {
//        StringBuilder sb = new StringBuilder(s);
//        return sb.reverse().toString();

        if (s == null){
            return "";
        }

        char[] charArray = s.toCharArray();
        int end = charArray.length-1;
        int start = 0;

        while (start<=end){
            char tem = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = tem;
            end--;
            start++;
        }

        String result = String.valueOf(charArray);
        return result;

    }

    public static void main(String[] args){
        String re;
        re = reverseString("hello");
        System.out.print(re);
    }
}
