/**
 * Created by songqingyuan on 1/25/17.
 */
public class isPalindromeL {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while(slow!=null){
            if(slow.val!=fast.val) return false;
            slow=slow.next;
            fast=fast.next;

        }
        return true;
    }

    public ListNode reverse(ListNode root){
        ListNode pre = null;
        while(root!=null){
            ListNode next = root.next;
            root.next = pre;
            pre = root;
            root = next;
        }
        return pre;
    }
}
