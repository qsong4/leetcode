/**
 * Created by songqingyuan on 1/12/17.
 */
import java.util.*;
public class readBinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<String>();

        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h*64+m)==num){
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }
}
