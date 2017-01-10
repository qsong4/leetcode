/**
 * Created by songqingyuan on 1/10/17.
 */
public class hammingDistance {

    public static int hammingDistance(int x, int y){

        char[] a = Integer.toBinaryString(x).toCharArray();
        char[] b = Integer.toBinaryString(y).toCharArray();
        char[] c;

        int length;
        int alen = a.length;
        int blen = b.length;

        if (alen>blen){
            length = blen;
            c = a;
        }
        else {
            c = b;
            length = alen;
        }

        int count=0;


        for (int i = 0; i<length;i++){

            if (a[alen-1-i] != b[blen-1-i]){
                count++;
            }
        }



        for (int i = 0; i<Math.abs(alen-blen); i++){

            if (c[i] == '1'){

                count++;
            }
        }


        return count;

    }

    public static void main(String[] arg){

        System.out.print(hammingDistance(1, 4));

    }
}
