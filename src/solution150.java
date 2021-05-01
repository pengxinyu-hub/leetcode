import java.util.Stack;

public class solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("-")){
                stack.push(-(stack.pop()-stack.pop()));
            }
            else if(token.equals("+"))
                stack.push(stack.pop()+stack.pop());
            else if(token.equals("*"))
                stack.push(stack.pop()*stack.pop());
            else if(token.equals("/")){
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2/num1);
            }
            else
                stack.push(Integer.parseInt(token));
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        String[] s=new String[]{"4","13","5","/","+"};
        System.out.println(new solution150().evalRPN(s));
    }
}
