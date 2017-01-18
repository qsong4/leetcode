/**
 * Created by songqingyuan on 1/17/17.
 */
public class removeElement2 {
    public int removeDuplicates(int[] nums) {
        int count=1;
        if(nums.length<2){
            return nums.length;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[count++]=nums[i];
            }

        }
        return count;
    }
}
