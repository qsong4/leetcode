/**
 * Created by songqingyuan on 11/7/16.
 */
public class NimGame {
    public static boolean canWinNim(int n){
        if (n < 4){
            return true;
        }

        else if (n%4 == 0){
            return false;
        }

        else
            return true;
    }

//    public static void main(String[] args){
//        boolean f;
//        f = canWinNim(4);
//        System.out.print(f);
//    }
}
