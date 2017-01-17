/**
 * Created by songqingyuan on 1/17/17.
 */
import java.util.*;
public class pascalTri {

    public static void main(String[] arg){
//        p(generate(15));
//        System.out.print(combine(13,1));
//        System.out.print(factorial(13)/factorial(12));

    }

    public static void p(List<List<Integer>> l){
        for (int i=0;i<l.size();i++){
            for (int j=0;j<l.get(i).size();j++){

                System.out.print(l.get(i).get(j)+",");

            }
            System.out.println();
        }
    }
/**
 * This method is wrong because recursivelly calculate factorial is not stable.
 */
//    public static List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList();
//        for(int i=0;i<numRows;i++){
//            List<Integer> tem = new ArrayList<>();
//            for(int j=0;j<=i;j++){
//                tem.add(combine(i, j));
//            }
//            result.add(tem);
//        }
//        return result;
//    }
//
//    private static int combine(int a, int b){
//        if(b==0) return 1;
//        return factorial(a)/(factorial(a-b)*factorial(b));
//    }
//    private static int factorial(int num){
//        if(num<0) return -1;
//        else if(num==0) return 1;
//        else return num*factorial(num-1);
//    }

public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList();
    List<Integer> tem = new ArrayList();

    for(int i=0;i<numRows;i++){
        tem.add(0,1);
        for(int j=1; j<tem.size()-1; j++){
            tem.set(j, tem.get(j)+tem.get(j+1));
        }
        result.add(new ArrayList<Integer>(tem));
    }

    return result;

}
}
