/**
 * Created by songqingyuan on 1/17/17.
 */

/**
 * sum = (x + 1) * x / 2
 * x = (-1 + sqrt(8 * n + 1)) / 2
 */
public class arrangeCoins {
    public int arrangeCoins(int n) {
        int a = 1;
        while(a>=0){
            n = n-a;

            if(n==0){
                break;
            }
            if(n<0){
                a--;
                break;
            }
            a++;
        }
        return a;
    }
}
