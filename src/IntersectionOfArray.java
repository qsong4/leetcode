import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by songqingyuan on 11/11/16.
 */
public class IntersectionOfArray {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> sNums1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();



        for (int i = 0; i<nums1.length; i++){
            sNums1.add(nums1[i]);
        }

        for (int i=0;i<nums2.length;i++){
            if (sNums1.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer num: intersection
             ) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args){
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        int[] c ;
        c = intersection(a, b);
        for (int i=0;i<c.length;i++) {
            System.out.print(c[i]);
        }


    }
}
