package Medium;

/**
 * Created by songqingyuan on 5/7/17.
 */
public class optimalDivision {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        if(nums.length<=2) {
            for(int i=0;i<nums.length;i++){
                if(i==0){
                    sb.append(nums[i]);
                }
                if(i==1){
                    sb.append("/"+nums[i]);
                }
            }
            return sb.toString();
        }
        sb.append(nums[0]+"/(");
        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1){
                sb.append(nums[i]+")");
            }
            else{
                sb.append(nums[i]+"/");
            }

        }
        return sb.toString();
    }
}
