/**
 * Created by songqingyuan on 1/14/17.
 */
public class maxProfit {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int tem = 0;
        for(int i=1;i<prices.length;i++){

            tem = tem + prices[i]-prices[i-1];
            if(tem<0){
                tem = 0;
            }

            if(tem>maxPro){
                maxPro = tem;
            }

        }

        return maxPro;
    }
}
