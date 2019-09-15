import java.util.Stack;

/**
 * @author vert  @date 2019/9/15 19:00
 */
/*
20. 有效的括号(https://leetcode-cn.com/problems/valid-parentheses/)
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:
输入: "()"
输出: true

示例 2:
输入: "()[]{}"
输出: true

示例 3:
输入: "(]"
输出: false

示例 4:
输入: "([)]"
输出: false

示例 5:
输入: "{[]}"
输出: true
 */
public class Solution020 {
    public static void main(String[] args) {
        String strs = "()[]{}";
        Solution020 s = new Solution020();
        System.out.println(s.isValid(strs));
    }
    //一道标准的使用堆栈的题
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            if (stack.size() == 0){
                stack.push(c);
            }else if (isSame(stack.peek(),c)){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }
    private boolean isSame(char c1,char c2){
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }
}
