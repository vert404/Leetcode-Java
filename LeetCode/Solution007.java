/**
 * @author vert  @date 2019/9/16 13:27
 */
/*
7. 整数反转(https://leetcode-cn.com/problems/reverse-integer/)
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:
输入: 123
输出: 321

 示例 2:
输入: -123
输出: -321

示例 3:
输入: 120
输出: 21

注意:
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Solution007 {
    public static void main(String[] args) {
        int x = 120;
        Solution007 s = new Solution007();
        System.out.println(s.reverse(x));
    }
    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int temp = res*10 + x%10;   //一开始的个位数变为最高位数
            if (temp/10 != res){       //temp可能溢出，值会发生改变
                return 0;
            }
            res = temp;
            x /= 10;    //将x变小一位
        }
        return res;
    }
}
