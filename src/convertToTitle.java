/**
 * Created by songqingyuan on 2/4/17.
 */
public class convertToTitle {
    public String convertToTitle(int n) {
        String tem = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String[] chart = tem.split(" ");
        StringBuilder sb = new StringBuilder();
        int t = n;
        while(t>0){
            t--;
            int index = t%26;
            t=t/26;



            sb.append(chart[index]);

        }
        return sb.reverse().toString().trim();
    }
}
