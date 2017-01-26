/**
 * Created by songqingyuan on 1/26/17.
 */
import java.util.*;
public class containNearby {



    public static void main(String[] args){
        int[] a ={99,99};
        int key = 2;
        boolean f ;
        f = containsNearbyDuplicate(a, key);
        System.out.print(f);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);

        }
        return false;
    }
}
