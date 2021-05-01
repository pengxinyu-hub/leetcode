import java.util.Stack;

public class solution739 {
    public int[] dailyTemperatures(int[] T) {
        int[] ans=new int[T.length];
        Stack<int[]> stack=new Stack<>();
        stack.push(new int[]{0,T[0]});
        for(int i=1;i<T.length;i++){
            while (!stack.isEmpty()&&T[i]>stack.peek()[1]){
                int[] a=stack.pop();
                ans[a[0]]=i-a[0];
            }
            stack.push(new int[]{i,T[i]});
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a=new solution739().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
