import java.util.Stack;

public class solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack1.push('(');
            else if(s.charAt(i)==')') {
                if(stack1.isEmpty()||stack1.pop()!='(')
                    return false;
            }
            else if(s.charAt(i)=='[')
                stack1.push('[');
            else if(s.charAt(i)==']') {
                if(stack1.isEmpty()||stack1.pop()!='[')
                    return false;
            }
            else if(s.charAt(i)=='{')
                stack1.push('{');
            else if(s.charAt(i)=='}') {
                if(stack1.isEmpty()||stack1.pop()!='}')
                    return false;
            }
        }
        return stack1.isEmpty();
    }
}
