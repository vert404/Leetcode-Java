/**
 * @author vert  @date 2019/9/16 14:04
 */
/*
9. 回文数(https://leetcode-cn.com/problems/palindrome-number/)
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:
输入: 121
输出: true

示例 2:
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。

示例 3:
输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。

进阶:
你能不将整数转为字符串来解决这个问题吗？
 */
public class Solution009 {
    public static void main(String[] args) {
        int x = 121;
        Solution009 s = new Solution009();
        System.out.println(s.isPalindrome(x));
    }
    public boolean isPalindrome(int x) {
        long a = x;
        if (a < 0) return false;
        long res = 0;
        while (a != 0){         //实现整数反转
            long temp = res*10 + a%10;  //一开始的个位数变为最后的最高位数，0除外
            res = temp;
            a /= 10;        //将a变小一位
        }
        return res == (long) x;
    }
}
