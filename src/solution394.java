import java.util.Stack;

public class solution394 {
    public String decodeString(String s) {
        if (s.length() == 0) return "";
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();
        int i = 0;
        stack.add(characters[i]);
        i++;
        while (i < s.length())
        {
            if(characters[i] == ']')
            {
                StringBuilder tempBuilder = new StringBuilder();
                char c = stack.pop();
                while (c != '[')
                {
                    tempBuilder.append(c);
                    c = stack.pop();
                }
                char[] tempArray = tempBuilder.toString().toCharArray();
                StringBuilder tempNumber = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                {
                    tempNumber.append(stack.pop());
                }
                int t = Integer.parseInt(tempNumber.reverse().toString());  // 找出数字
                while (t != 0)
                {
                    for (int k = tempArray.length - 1; k >= 0; k--)
                    {
                        stack.add(tempArray[k]);
                    }
                    t--;
                }
            }
            else
            {
                stack.add(characters[i]);
            }
            i++;
        }
        StringBuilder stringBUilder = new StringBuilder();
        while (!stack.isEmpty())
        {
            stringBUilder.append(stack.pop());
        }
        return stringBUilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new solution394().decodeString("3[a2[c]]"));
    }
}
