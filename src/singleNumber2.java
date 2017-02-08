/**
 * Created by songqingyuan on 2/8/17.
 */
import java.util.*;
public class singleNumber2 {

    public static void main(String[] args){
        int[] a = {1,2,1,3,2,5};

    }

    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        int j=0;
        int i=1;
        while(i<nums.length){
            if(nums[j]!=nums[i]){
                set.add(nums[j]);
                set.add(nums[i]);
                i++;
                j++;
            }
            else{
                set.remove(nums[j]);
                i+=2;
                j+=2;
            }

        }
        if(j==nums.length-1){
            set.add(nums[j]);
        }
        int[] result = new int[set.size()];
        int y = 0;
        for (Integer in : set) {
            result[y] = in;
            y++;
        }
        return result;
    }
}
