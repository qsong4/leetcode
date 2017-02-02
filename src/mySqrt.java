/**
 * Created by songqingyuan on 2/2/17.
 */
public class mySqrt {
    public int mySqrt(int x) {
        if(x==0) return 0;
        long mid=x;

        while(x<mid*mid){
            mid = (mid + x/mid)/2;
        }
        return (int)mid;
    }
}
