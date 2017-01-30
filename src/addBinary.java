/**
 * Created by songqingyuan on 1/30/17.
 */
public class addBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0||j>=0||carry>0){
            int sum = ((i<0)?0:a.charAt(i--) - '0')+((j<0)? 0:b.charAt(j--) - '0')+carry;
            sb.append(Integer.toString(sum&1));
            carry = (sum>>1)&1;
        }
        return sb.reverse().toString();
    }
}
