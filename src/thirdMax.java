/**
 * Created by songqingyuan on 2/2/17.
 */
public class thirdMax {

    public static void main(String[] args){
        int[] a = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
        int b = thirdMax(a);
        System.out.print(b);
    }

    public static int thirdMax(int[] nums) {
        Integer maxA = null;
        Integer maxB = null;
        Integer maxC = null;

        for(Integer n :nums){

            if(n.equals(maxA)||n.equals(maxB)||n.equals(maxC)) continue;
            if(maxA==null||n>maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = n;
            }
            else if(maxB==null||n>maxB){
                maxC = maxB;
                maxB = n;
            }
            else if(maxC==null||n>maxC) maxC = n;
        }
        System.out.print(maxA+","+maxB+","+maxC);
        return maxC==null? maxA:maxC;

    }
}
