package samples.fb.stacks;

import java.util.Stack;

public class BalanceBrackets {


    boolean isBalanced(String s) {
        // Write your code here
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            boolean ok = true;
            ok = ok && checkBracket(c, '(', ')', stack);
            ok = ok && checkBracket(c, '[', ']', stack);
            ok = ok && checkBracket(c, '{', '}', stack);
            if (!ok) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    boolean checkBracket(char c, char openTarget, char closeTarget, Stack<Character> stack) {
        if (c == openTarget) {
            stack.add(c);
            return true;
        }

        if (c == closeTarget) {
            if (stack.isEmpty()) {
                return false;
            }
            char prev = stack.pop();
            return prev == openTarget;
        }

        return true;
    }


}

