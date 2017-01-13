/**
 * Created by songqingyuan on 1/13/17.
 */
public class isHappy {

    public static void main(String[] arg){
        System.out.println(isHappy(7));
    }

    public static int sum(int a){
        int sum = 0;
        int tem;

        while(a>0){
            tem = a%10;
            System.out.println(tem);
            sum = sum+tem*tem;
            a = a/10;
        }

        return sum;
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = sum(n);

        while(slow!=fast){
            slow = sum(slow);
            fast = sum(fast);
            fast = sum(fast);
        }

        if(slow==1){
            return true;
        }
        return false;
    }
}
