/**
 * Created by songqingyuan on 1/15/17.
 */
public class rob {
    public int rob(int[] nums) {
        int robCurPre = 0;
        int notrobCurPre =0;
        for(int i=0;i<nums.length;i++){
            int robcur = notrobCurPre + nums[i];
            int notrobcur = Math.max(robCurPre, notrobCurPre);

            robCurPre = robcur;
            notrobCurPre = notrobcur;
        }

        return Math.max(robCurPre, notrobCurPre);
    }
}
