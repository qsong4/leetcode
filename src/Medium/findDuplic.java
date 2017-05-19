package Medium;

/**
 * Created by songqingyuan on 5/19/17.
 */
public class findDuplic {
    // public int findDuplicate(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 return nums[i];
    //             }
    //         }
    //     }
    //     return 0;
    // }

    public int findDuplicate(int[] nums)
    {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}
