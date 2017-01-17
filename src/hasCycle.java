/**
 * Created by songqingyuan on 1/17/17.
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode lower = head;
        ListNode faster = head;
        while(faster.next!=null && faster.next.next!=null){
            lower = lower.next;
            faster = faster.next.next;

            if(lower==faster) return true;
        }
        return false;
    }
}
