/**
 * Created by songqingyuan on 1/14/17.
 */
public class mergeList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode merhead;
        if(l1.val<l2.val){
            merhead = l1;
            merhead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            merhead = l2;
            merhead.next = mergeTwoLists(l1, l2.next);
        }
        return merhead;
    }
}
