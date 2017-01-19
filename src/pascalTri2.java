/**
 * Created by songqingyuan on 1/18/17.
 */
import java.util.*;
public class pascalTri2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            result.add(0,1);
            for(int j=1;j<result.size()-1;j++){
                result.set(j, result.get(j)+result.get(j+1));
            }
        }
        return result;
    }
}
