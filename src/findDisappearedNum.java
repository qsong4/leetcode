/**
 * Created by songqingyuan on 1/11/17.
 */
import java.util.List;
import java.util.ArrayList;


public class findDisappearedNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ret = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]>0){
                ret.add(j+1);
            }
        }

        return ret;
    }
}
