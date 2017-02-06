/**
 * Created by songqingyuan on 2/6/17.
 */
public class ArithSlice {
    public int numberOfArithmeticSlices(int[] A) {
        int cur = 0;
        int sum = 0;
        for(int i=2;i<A.length;i++){
            if(A[i]-A[i-1]==A[i-1]-A[i-2]){
                cur+=1;
                sum += cur;
            }
            else{
                cur=0;
            }
        }
        return sum;
    }
}
