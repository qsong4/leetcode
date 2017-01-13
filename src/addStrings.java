/**
 * Created by songqingyuan on 1/13/17.
 */
public class addStrings {
    public static void main(String[] arg){
        char a = '1';
        char b = '1';
        int sum = a+b;
        System.out.println(sum);
    }

    public String addStrings(String num1, String num2) {
        int length1 = num1.length()-1;
        int length2 = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while(length1>=0||length2>=0||carry>=1){

            int a = length1<0 ? 0:num1.charAt(length1--)-'0';
            int b = length2<0 ? 0:num2.charAt(length2--)-'0';

            sb.append((a+b+carry)%10);
            carry = (a+b+carry)/10;

        }

        return sb.reverse().toString();
    }
}
