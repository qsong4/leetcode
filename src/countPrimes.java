/**
 * Created by songqingyuan on 2/3/17.
 */
public class countPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isnotPrime = new boolean[n];
        for(int i=2;i<n;i++){
            if(isnotPrime[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    isnotPrime[i*j]=true;
                }
            }
        }
        return count;
    }
}
