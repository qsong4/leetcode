/**
 * Created by songqingyuan on 2/6/17.
 */
public class findPoisionDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries==null||duration==0) return 0;
        int result=0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1]>=duration){
                result += duration;
            }
            else{
                result += timeSeries[i]-timeSeries[i-1];
            }
        }
        return result+duration;
    }
}
