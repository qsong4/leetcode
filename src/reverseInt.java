/**
 * Created by songqingyuan on 2/5/17.
 */
public class reverseInt {
    public int reverse(int x) {

        int result = 0;
        while(x!=0){
            int tem = x%10;
            int newresult = result*10 + tem;
            if((newresult-tem)/10!=result) return 0;
            x = x/10;
            result = newresult;
        }
        return result;
    }
}
