/**
 * Created by songqingyuan on 2/10/17.
 */
public class magicString {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;
        int[] tem = new int[n+1];
        tem[0] = 1;tem[1] = 2;tem[2] = 2;
        int x=2,y=3,num=1,count=1;
        while(y<n){
            for(int i=0;i<tem[x];i++){
                tem[y] = num;
                if(num==1&& y < n) count++;
                y++;
            }
            num = 3 - num;
            x++;
        }
        return count;
    }
}
