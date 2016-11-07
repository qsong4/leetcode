import java.util.ArrayList;
import java.util.List;

/**
 * Created by songqingyuan on 11/5/16.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<String>();
        for (int i=1; i<=n; i++){
            if (i%3 == 0 && i%5 != 0){
                result.add("Fizz");
            }
            else if (i%5 == 0 && i%3 != 0){
                result.add("Buzz");
            }
            else if (i%5 == 0 && i%3 == 0){
                result.add("FizzBuzz");
            }
            else {
                result.add(""+i);
            }

        }
        return result;
    }

    public static void main(String[] args){
        List<String> re;
        int n = 15;
        re = fizzBuzz(n);
        System.out.print(re);
    }
}
