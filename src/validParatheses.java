/**
 * Created by songqingyuan on 1/25/17.
 */
import java.util.*;
public class validParatheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty()||stack.pop()!=c) return false;
        }

        return stack.isEmpty();
    }
}
