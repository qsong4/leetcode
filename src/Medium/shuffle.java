package Medium;
import java.util.Random;

/**
 * Created by songqingyuan on 5/8/17.
 */
public class shuffle {
    Random random;
    int[] tem;
    int[] ori;

    public shuffle(int[] nums) {
        tem = nums;
        ori = new int[nums.length];
        for(int i=0;i<nums.length;i++) ori[i] = nums[i];

        random = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return ori;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=1;i<tem.length;i++){
            int r = random.nextInt(i+1);
            swap(tem, r, i);
        }
        return tem;
    }
    private int[] swap(int[] a, int x, int y){
        int tem1 = a[x];
        a[x] = a[y];
        a[y] = tem1;
        return a;
    }
}
