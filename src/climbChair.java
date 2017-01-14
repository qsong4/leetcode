/**
 * Created by songqingyuan on 1/14/17.
 */
public class climbChair {
    public int climbStairs(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;

        int a =1;
        int b =2;
        int total=0;

        for(int i=1;i<n-1;i++){
            total = a + b;
            a = b;
            b = total;
        }
        return total;
    }
}
