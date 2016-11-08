/**
 * Created by songqingyuan on 11/8/16.
 */
public class addDigits {
    public int addDigits(int num){
        if (num == 0){
            return 0;
        }

        if (num == 9){
            return 9;

        }

        else
            return num%9;
    }
}
