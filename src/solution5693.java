import java.util.PriorityQueue;

public class solution5693 {
    public int secondHighest(String s) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                queue.add(s.charAt(i)-'0');
        }
        if(queue.isEmpty())  return -1;
        int a=queue.poll();
        while (!queue.isEmpty()){
            int b=queue.poll();
            if(b!=a)
                return b;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new solution5693().secondHighest("077"));
    }
}
