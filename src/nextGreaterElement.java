/**
 * Created by songqingyuan on 2/22/17.
 */
public class nextGreaterElement {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        int[] tem = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            tem[i]=nums[i];
        }
        for(int i=nums.length;i<nums.length*2;i++){
            tem[i]=nums[i-nums.length];
        }
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            flag = true;
            for(int j=i+1;j<tem.length;j++){
                if(tem[j]>tem[i]){
                    result[i]=tem[j];
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[i]=-1;
                flag = true;
            }
        }
        return result;
    }
}
