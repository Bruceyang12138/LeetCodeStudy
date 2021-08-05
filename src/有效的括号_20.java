import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class 有效的括号_20 {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //业务逻辑，让字符串依次入栈，但是入栈之前和栈顶元素作一个匹配，若为一对，则栈顶元素出栈
        //符合可大致分为两类，一类是左符号，一类是右符号。左符号直接入栈，右符号才去检测匹配
        HashMap<Character, Character> leftToRight = new HashMap<Character, Character>() {
            {
                put('(', ')');
                put('{', '}');
                put('[', ']');
            }
        };

        //开始逐个检测输入字符串的符号
        for (int i = 0; i < s.length(); i++) {
            //检测到左符号直接入栈
            if (leftToRight.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (leftToRight.containsValue(s.charAt(i))) {
                //此条件为，如果栈顶元素与目前要入栈元素相匹配,则元素出栈
                if (stack.empty() == false) {
                    if (leftToRight.get(stack.peek()) == s.charAt(i)) {
                        stack.pop();
                    }else return false;
                } else return false;
            }

        }
        if (stack.empty() == true) {
            return true;
        } else return false;
    }

}
