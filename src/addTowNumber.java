/**
 * Created by songqingyuan on 2/14/17.
 */
import java.util.*;
public class addTowNumber {

    public static void main(String[] args){
        ListNode x0 = new ListNode(7);
        ListNode x1 = new ListNode(2);
        ListNode x2 = new ListNode(4);
        ListNode x3 = new ListNode(3);
        x0.next=x1;
        x1.next = x2;
        x2.next=x3;
        ListNode y1 = new ListNode(5);
        ListNode y2 = new ListNode(6);
        ListNode y3 = new ListNode(4);

        y1.next = y2;
        y2.next=y3;
        ListNode a = addTwoNumbers(x0,y1);
        while(a!=null){
            System.out.println(a.val);
            a=a.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
            if(!stack1.empty()&&!stack2.empty()){
                int a = stack1.pop();
                int b = stack2.pop();
                System.out.println(a+b);
                sum = a+b+carry;
            }
            if(!stack1.empty()&&stack2.empty()) sum=stack1.pop()+carry;
            if(stack1.empty()&&!stack2.empty()) sum=stack2.pop()+carry;

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

        }
        return dummy.next;
    }
}
