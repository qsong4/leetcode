/**
 * Created by songqingyuan on 1/12/17.
 */

import java.util.*;
public class longestPalindrome {

    public static void main(String[] arg){
        System.out.print(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        Map m = new HashMap();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(m.containsKey(c[i])){
                int val = (int)m.get(c[i])+1;
                m.put(c[i], val);
            }
            else{
                m.put(c[i], 1);
            }
        }

        int[] v= new int[m.keySet().size()];
        int i =0;
        for(Object obj : m.keySet()){
            int value = Integer.parseInt(String.valueOf(m.get(obj)));

            v[i] = value;
            i++;

        }

        Arrays.sort(v);

        int sum=0;
        boolean flag = false;
        for(int j=v.length-1;j>=0;j--){
            if(v[j]%2==0){
                sum = sum+v[j];
            }

            else if (v[j]>=1){

                flag=true;
                sum = sum+v[j]-1;
            }
        }
        if (flag){
            sum=sum+1;
        }


        return sum;
    }
}
