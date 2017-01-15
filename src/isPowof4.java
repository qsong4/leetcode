/**
 * Created by songqingyuan on 1/15/17.
 */

/**
 * This method can use to any question like this.
 */
public class isPowof4 {
    public boolean isPowerOfFour(int num) {
        String s = Integer.toString(num, 4);
        return s.matches("10*")?true:false;
    }
}
