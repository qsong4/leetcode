/**
 * Created by songqingyuan on 1/23/17.
 */
public class trailingZeroes {

    public int trailingZeroes(int n) {
        return n == 0? 0: n/5 + trailingZeroes(n/5);
    }
}
