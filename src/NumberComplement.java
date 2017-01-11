/**
 * Created by songqingyuan on 1/11/17.
 */
public class NumberComplement {
    public int findComplement(int num) {
        char[] bin = Integer.toBinaryString(num).toCharArray();
        int[] aaa = new int[bin.length];
        int ret=0;
        for(int i=0;i<bin.length;i++){
            if(bin[i]=='1'){
                aaa[i]=0;
            }
            else{
                aaa[i]=1;
            }
        }

        for(int i=aaa.length-1;i>=0;i--){
            if(aaa[i]!=0){
                ret = (int)(ret + Math.pow(2, aaa.length-i-1));
            }

        }

        return ret;

    }
}
