/**
 * Created by songqingyuan on 1/16/17.
 */
public class plusone {
    public int[] plusOne(int[] digits) {
        boolean f = false;
        int[] aaa = new int[digits.length+1];

        for(int i=digits.length-1;i>=0;i--){
            aaa[i+1]=0;
            if(i==0&&digits[i]==9){
                aaa[0] = 1;
                return aaa;
            }

            if(digits[i]==9){
                digits[i]=0;
                f=true;
                continue;
            }
            if(f&&digits[i]<9){
                digits[i]++;
                break;
            }
            if(!f&&digits[i]<9){
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}
