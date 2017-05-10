package Medium;

/**
 * Created by songqingyuan on 5/10/17.
 */
public class subArraysum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;i+j<nums.length;j++){
                sum += nums[i+j];

                if(sum==k){
                    count++;
                    continue;
                }

            }
        }
        return count;
    }
}
