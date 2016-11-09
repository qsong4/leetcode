/**
 * Created by songqingyuan on 11/8/16.
 */
public class moveZero {
    public static void moveZeros(int[] nums){
        int j;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] == 0 ){
                for (j=i+1;j<nums.length;j++){
                    if (nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }

                }

            }
        }
    }

    public static void main(String[] args){
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        for (int i=0 ; i<a.length;i++){
            System.out.print(a[i]);
        }

    }
}
