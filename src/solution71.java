import java.util.Scanner;
import java.util.Stack;

public class solution71 {
    public String simplifyPath(String path) {
        String ans="";
        String[] SP=path.split("/");
        Stack<String> stack=new Stack<>();
        for(String s:SP){
           if(s.equals("..")){
               if(!stack.isEmpty())
                   stack.pop();
           }
           else if(s.equals(".")||s.equals("")){
               continue;
           }
           else {
               stack.push(s);
           }
        }
        if(stack.isEmpty())
            return "/";
        for(String s:stack){
            ans+=("/"+s);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(new solution71().simplifyPath(sc.next()));
    }
}
