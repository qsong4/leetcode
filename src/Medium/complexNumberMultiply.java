package Medium;
import java.util.stream.Stream;

/**
 * Created by songqingyuan on 5/7/17.
 */
public class complexNumberMultiply {
    public String complexNumberMultiply(String a, String b) {
        int[] A = Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        int[] B = Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray();
        return (A[0]*B[0]-A[1]*B[1])+"+"+(A[0]*B[1]+A[1]*B[0])+"i";
    }
}
