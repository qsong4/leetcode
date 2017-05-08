package Medium;

/**
 * Created by songqingyuan on 5/8/17.
 */
public class Solution {

    public static int count;
    public int[] id;
    public Solution(int n){
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int find(int p){
        return id[p];
    }

    public void union(int p, int q){
        if(id[p]==id[q]) return;
        for(int i=0;i<id.length;i++){
            if(id[i]==id[p]){
                id[i]=q;
            }
        }
        count--;
    }

    public static int findCircleNum(int[][] M) {
        int n = M.length;
        Solution uf = new Solution(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
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