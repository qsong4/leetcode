/**
 * Created by songqingyuan on 2/6/17.
 */
import java.util.*;
public class minMoves2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result += Math.abs(nums[i]-mid);
        }

        return result;
    }
}
