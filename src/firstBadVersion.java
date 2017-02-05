/**
 * Created by songqingyuan on 2/4/17.
 */
public class firstBadVersion {

    public boolean isBadVersion(int n){
        return true;
    }
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
