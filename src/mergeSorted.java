import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by songqingyuan on 1/26/17.
 */
public class mergeSorted {
    Queue<Integer> queue = new LinkedList<>();

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int i = m-1;
        int j = n-1;


        while(i>=0 && j>=0){
            nums1[k--] = nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }

}
