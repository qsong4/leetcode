/**
 * Created by songqingyuan on 1/25/17.
 */
public class computeArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C-A)*(D-B);
        int areaB = (G-E)*(H-F);

        int overlap = 0;
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        int left = Math.max(A,E);
        int right = Math.min(C, G);
        if(right>left&&top>bottom){
            overlap = (right-left)*(top-bottom);
        }

        return areaA + areaB - overlap;
    }
}
