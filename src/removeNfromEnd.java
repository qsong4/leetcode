/**
 * Created by songqingyuan on 1/25/17.
 */
public class removeNfromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode point1 = new ListNode(0);
        ListNode start=point1;
        point1.next = head;
        ListNode point2 = head;
        int count = 0;

        while(point2.next!=null){
            if(count<n-1){
                point2=point2.next;
                count++;
            }
            else{
                point2=point2.next;
                point1=point1.next;
            }
        }


        point1.next = point1.next.next;


        return start.next;

    }
}
