/**
 * Created by songqingyuan on 11/7/16.
 */
import java.util.Arrays;
public class SingleNumber {
    public static int singleNumber(int[] nums){
        Arrays.sort(nums);
        try {
            for (int i = 0; i<nums.length; i= i + 2){
                if (nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return nums[nums.length-1];
        }
        return 0;
    }

    public static void main(String[] args){
        int a;
        int[] b = {1,1,2,2,8,8,9};
        a = singleNumber(b);
        System.out.print(a);
    }
}
