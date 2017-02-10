/**
 * Created by songqingyuan on 2/10/17.
 */
import java.util.*;
public class getRandom {
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    Random r = null;
    ListNode head = null;
    public getRandom(ListNode head) {
        this.head = head;
        this.r = new Random();
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode result = null;
        ListNode current = head;
        for(int i=1;current!=null;i++){
            if(r.nextInt(i)==0){
                result = current;
            }
            current = current.next;
        }
        return result.val;
    }
}
