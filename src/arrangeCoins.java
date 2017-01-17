/**
 * Created by songqingyuan on 1/17/17.
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
