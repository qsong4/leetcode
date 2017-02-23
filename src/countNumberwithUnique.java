/**
 * Created by songqingyuan on 2/23/17.
 */
public class countNumberwithUnique {

    public static void main(String[] args){
       int a = countNumbersWithUniqueDigits(3);
        System.out.print(a);
    }

    public static int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int result =9;
        int avial = 9;
        int res = 10;
        for(int i=2;i<=n;i++){

            result = result * avial;
            avial--;
            res = res+result;

        }

        return res;
    }
}
