/**
 * Created by songqingyuan on 1/11/17.
 */
public class minMoves {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return sum-min*nums.length;


    }
}
