/**
 * Created by songqingyuan on 1/24/17.
 */
public class countandsay {
    public String countAndSay(int n) {
        String result = "1";
        for(int i=0;i<n;i++){
            result = count(result);
        }
        return result;
    }

    public String count(String s){
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int counts = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c){
                counts++;
            }
            else{
                sb.append(counts);
                sb.append(c);
                c = s.charAt(i);
                counts=1;
            }
        }
        sb.append(counts);
        sb.append(c);
        return sb.toString();

    }
}
