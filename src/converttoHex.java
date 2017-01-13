/**
 * Created by songqingyuan on 1/13/17.
 */
public class converttoHex {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String s = "";
        if(num==0) return "0";

        while(num!=0){
            s = map[num&15] + s;

            num = (num >>> 4);
        }

        return s;

    }
}
