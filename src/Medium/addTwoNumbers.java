package Medium;
import java.util.*;

/**
 * Created by songqingyuan on 5/8/17.
 */
public class addTwoNumbers {


     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if(l1==null&&l2!=null) return l2;
            if(l1!=null&&l2==null) return l1;
            if(l1==null&&l2==null) return l1;

            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            while(l1!=null){
                stack1.push(l1.val);
                l1 = l1.next;
            }
            while(l2!=null){
                stack2.push(l2.val);
                l2 = l2.next;
            }
            int sum=0, carry=0, count=0;
            ListNode dummy = new ListNode(0);

            while(!stack1.empty()||!stack2.empty()){

                if(!stack1.empty()&&!stack2.empty())sum=stack1.pop()+stack2.pop()+carry;
                else if(!stack1.empty()&&stack2.empty()) sum=stack1.pop()+carry;
                else if(stack1.empty()&&!stack2.empty()) sum=stack2.pop()+carry;

                carry=sum/10;
                if(count==0){
                    ListNode head = new ListNode(sum%10);
                    dummy.next = head;
                    count++;
                }
                else{
                    ListNode head = new ListNode(sum%10);
                    head.next = dummy.next;
                    dummy.next = head;
                }
                if(stack1.empty()&&stack2.empty()&&carry!=0){
                    ListNode head = new ListNode(carry);
                    head.next = dummy.next;
                    dummy.next = head;
                }
            }
            return dummy.next;
        }


}
