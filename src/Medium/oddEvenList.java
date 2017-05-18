package Medium;
import java.util.*;

/**
 * Created by songqingyuan on 5/18/17.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
public class oddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head != null) {

            ListNode odd = head, even = head.next, evenHead = even;

            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}
