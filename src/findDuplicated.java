/**
 * Created by songqingyuan on 2/8/17.
 */
import java.util.*;
public class findDuplicated {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new LinkedList<>();
        int i = 0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                result.add(nums[i]);
            }
            i++;
        }
        return result;
    }
}
