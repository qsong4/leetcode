/**
 * Created by songqingyuan on 2/5/17.
 */
public class rotate {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] arr, int start, int end){
        while(start<end){
            int tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start++;
            end--;
        }
    }
}
