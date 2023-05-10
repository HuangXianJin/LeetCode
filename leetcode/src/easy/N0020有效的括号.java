package easy;

import java.util.Stack;

/**
 * 有效字符串需满足：
 * <p>
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * <p>
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * <p>
 * <p>
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * <p>
 * <p>
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 **/

public class N0020有效的括号 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty())
                    return false;
            }
            if (c == ')' && stack.pop().charValue() != '(') {
                return false;
            }
            if (c == ']' && stack.pop().charValue() != '[') {
                return false;
            }
            if (c == '}' && stack.pop().charValue() != '{') {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("]"));
    }
}
