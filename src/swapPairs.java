/**
 * Created by songqingyuan on 1/16/17.
 */
public class swapPairs {

    public static void main(String[] arg){
        ListNode head = new ListNode(1);

    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;

        if(head == null){
            return head;
        }
        while(cur.next!=null&&cur.next.next!=null){
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            cur.next = second;
            second.next = first;
            cur = cur.next.next;

        }
        return dummy.next;
    }
}
