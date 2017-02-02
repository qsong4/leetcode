/**
 * Created by songqingyuan on 1/14/17.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}


}
public class deleteDup {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(node==null){
            return head;
        }

        if(node.next==null){
            return head;
        }

        while(node.next!=null){
            ListNode tem = node.next;
            if(node.next.val==node.val){
                node.next = tem.next;
            }else{
                node = node.next;
            }

            if(node==null){
                break;
            }
        }

        return head;
    }
}
