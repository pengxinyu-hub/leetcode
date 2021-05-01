import java.util.Stack;

public class solution227 {
    public int calculate(String s) {
        int sign=0;
        int res=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int cur=ch-'0';
                while (i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                    cur=cur*10+s.charAt(++i)-'0';
                }
                if(sign==1){
                    cur=res*cur;
                    sign=0;
                }
                else if(sign==-1) {
                    cur = res / cur;
                    sign=0;
                }
                stack.push(cur);
            } else if(ch=='+'){
                stack.push(1);
            } else if (ch == '-') {
                stack.push(-1);
            }else if(ch=='*'){
                res=stack.pop();
                sign=1;
            }else if(ch=='/'){
                res=stack.pop();
                sign=-1;
            }
        }
        int result=0;
        while (stack.size()>1){
            result+=stack.pop()*stack.pop();
        }
        result+=stack.pop();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new solution227().calculate("3*5"));
    }
}
