package Medium;

/**
 * Created by songqingyuan on 5/8/17.
 */
public class Solution {


    public int count=0;
    public static int[] root;


    public static void union(int p, int q){
        while(root[p]!=p) p = root[p];
        while(root[q]!=q) q = root[q];
        if(p!=q){
            root[q] = p;
        }
    }

    public static int findCircleNum(int[][] M) {
        int n = M.length;
        root = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) union(i, j);
            }
        }

        int count=0;
        for(int i =0;i<root.length;i++){
            if(i==root[i]) count++;
        }


        return count;
    }
    public static void main(String[] args){
        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 1;
        m[1][1] = 1;
        m[1][0] = 1;
        m[2][2] = 1;
        m[1][2] = 1;
        m[2][1] = 1;
        int a = findCircleNum(m);
        System.out.print(a);
    }
}