import java.util.Stack;

public class solution331 {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack=new Stack<>();
        String[] strings=preorder.split(",");
        stack.push("0");
        for(String s:strings){
            if(s.equals("#")){
                if(stack.isEmpty())  return false;
                stack.pop();
            }
            else {
                if(stack.isEmpty())  return false;
                stack.push(s);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new solution331().isValidSerialization("1,#,#,#,#"));
    }
}
