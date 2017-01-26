/**
 * Created by songqingyuan on 1/26/17.
 */
public class removeElement1 {
    public ListNode removeElements(ListNode head, int val) {


        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode node = pre;
        while(node.next!=null){
            if(node.next.val==val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return pre.next;
    }
}
