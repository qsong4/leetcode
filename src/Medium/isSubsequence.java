package Medium;

/**
 * Created by songqingyuan on 5/9/17.
 */
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int indexT=0,indexS=0;
        while(indexT<t.length()){
            if(s.charAt(indexS)==t.charAt(indexT)){
                indexS++;
                if(indexS==s.length()) return true;
            }
            indexT++;
        }
        return false;

    }
}
