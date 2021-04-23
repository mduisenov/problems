package hackerrank.data_structures.promlems;

import java.util.Stack;

public class BalancedBrackets {
    private static char[][] TOKENS = {{'{','}'},{'[',']'},{'(',')'}};

    private static boolean isOpenTerm(char c) {
        for(char[] array : TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean matches(char openTerm, char closeTerm) {
        for(char[] array : TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !matches(stack.pop(), c)){
                    return "NO";
                }
            }
        }
        return stack.empty() ? "YES" : "NO";

    }
}
