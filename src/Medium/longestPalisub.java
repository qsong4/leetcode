package Medium;

/**
 * Created by songqingyuan on 5/20/17.
 */
public class longestPalisub {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) a[i][i]=1;
        return helper(a,0,n-1,s);
    }
    private int helper(int[][] a,int i,int j,String s){
        if(i>j || a[i][j]!=0) return a[i][j];
        if(s.charAt(i)==s.charAt(j)) a[i][j]=helper(a,i+1,j-1,s)+2;
        else a[i][j]=Math.max(helper(a,i,j-1,s),helper(a,i+1,j,s) );
        return a[i][j];
    }

}
