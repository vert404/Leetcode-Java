/**
 * @author vert  @date 2019/8/24 14:01
 */
/*
67. 二进制求和(https://leetcode-cn.com/problems/add-binary/)
给定两个二进制字符串，返回他们的和（用二进制表示）。
输入为非空字符串且只包含数字 1 和 0。

示例 1:
输入: a = "11", b = "1"
输出: "100"

示例 2:
输入: a = "1010", b = "1011"
输出: "10101"
 */
public class Solution067 {
    public static void main(String[] args) {
        String a = "1010",b = "1011";
        Solution067 s = new Solution067();
        System.out.println(s.addBinary(a,b));
    }
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();//两字符串相加的结果字符串
        int m = a.length()-1,n = b.length()-1,carry = 0;
        while (m>=0 || n>=0){//两字符串可能长度不同
            int i = m>=0 ? a.charAt(m--) - '0' : 0;//取出一个字符，减去字符'0',转为数字0或1。超出长度赋值为0
            int j = n>=0 ? b.charAt(n--) - '0' : 0;//m,n先执行charAt()方法，后减1
            int sum = i + j + carry;//取出的两个数与进位carry，三者加起来，对2取余即为当前位的数字，对2取商即为当前进位的值
            str.append(sum%2);//取余为当前位的数字,字符串拼接方向对应二进制高位方向
            carry = sum/2;//设置进位
        }
        str.append(carry == 1 ? carry : "");//判断二进制最高位是否有进位
        return str.reverse().toString();//逆转为二进制高位在前，返回String类型
    }
}
