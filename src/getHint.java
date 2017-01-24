/**
 * Created by songqingyuan on 1/24/17.
 */
public class getHint {
    public String getHint(String secret, String guess) {
        int[] num = new int[10];
        int bull = 0;
        int cows = 0;
        for(int i=0;i<10;i++){
            num[i] = 0;
        }
        for(int i=0;i<secret.length();i++){
            num[secret.charAt(i)-'0']++;
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
            }
        }

        for(int i=0;i<guess.length();i++){
            if(num[guess.charAt(i)-'0']>0){
                cows++;
                num[guess.charAt(i)-'0']--;
            }
        }
        return bull+"A"+(cows-bull)+"B";
    }
}
