/**
 * Created by songqingyuan on 11/7/16.
 */
public class SumofInt {
    public static int getSum(int a, int b) {
        int carry = a & b;
        int result = a ^ b;
        while (carry!=0){
            a = carry << 1;
            b = result;
            result = a ^ b;
            carry = a & b;
        }
        return result;

    }
    public static void main(String[] args){
        int result;
        result = getSum(3,2);
        System.out.print(result);

    }
}
