/**
 * Created by songqingyuan on 1/12/17.
 */
import java.util.*;
public class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len=0;
        ArrayList a1 = new ArrayList();

        int j=0;
        int i=0;


        while(i<nums2.length&&j<nums1.length){

            if(nums1[j]==nums2[i]){
                a1.add(nums2[i]);
                i++;
                j++;
            }
            else if(nums2[i]<nums1[j]){
                i++;
            }
            else if(nums2[i]>nums1[j]){
                j++;
            }


        }




        int[] ret=new int[a1.size()];
        for(i=0,j=a1.size();i<j;i++){
            ret[i]=Integer.parseInt(String.valueOf(a1.get(i)));
        }
        return ret;

    }
}
