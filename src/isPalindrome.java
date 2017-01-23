/**
 * Created by songqingyuan on 1/23/17.
 */
public class isPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int re = 0;
        int y = x;
        while(y>0){
            re = re*10 + y%10;
            y = y/10;
        }

        return re == x;
    }
}
