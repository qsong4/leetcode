import java.util.List;

/**
 * Created by songqingyuan on 2/1/17.
 */
public class getIntersection {

//    public static void main(String[] args){
//        ListNode head = new ListNode(0);
//        ListNode a = new ListNode(1);
//        ListNode b = new ListNode(2);
//        head.next = a;
//        a.next = b;
//
//        ListNode aa = reverseL(head);
//        while(aa!=null){
//            System.out.print(aa.val);
//            aa = aa.next;
//        }
//    }
//Does not work, because it change the structure of list
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA==null || headB==null){
//            return null;
//        }
//        ListNode A = reverseL(headA);
//        ListNode B = reverseL(headB);
//
//        while(A!=null&&B!=null){
//            if(A==B){
//                return A;
//            }
//            else{
//                A=A.next;
//                B=B.next;
//            }
//        }
//
//        return null;
//    }
//
//    public ListNode reverseL(ListNode head){
//        ListNode dummy;
//        ListNode pre = head;
//        ListNode curr = head.next;
//        while(curr!=null){
//            dummy=curr.next;
//            curr.next = pre;
//            pre = curr;
//            curr=dummy;
//
//        }
//        head.next = null;
//        return pre;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a!=b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
        }

        return a;
    }
}
