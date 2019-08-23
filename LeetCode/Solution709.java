/**
 * @author vert  @date 2019/8/23 15:43
 */
/*
709. 转换成小写字母(https://leetcode-cn.com/problems/to-lower-case/)

实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

示例 1：
输入: "Hello"
输出: "hello"

示例 2：
输入: "here"
输出: "here"

示例 3：
输入: "LOVELY"
输出: "lovely"
 */
public class Solution709 {
    public static void main(String[] args) {
        String a = "Hello";
        Solution709 s = new Solution709();
        System.out.println(s.toLowerCase(a));
    }
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        char tmp;
        for (int i=0;i<str.length();i++){
            tmp = str.charAt(i);
            if(tmp>='A' && tmp<='Z'){
                tmp = (char)(tmp+32);//按照ASCII码，大写字母比小写字母大32
            }
            sb.append(tmp);//添加到sb对象末尾，形成新的字符串
        }
        return sb.toString();
        //return str.toLowerCase();//直接调用String的转换大写字母方法
    }
}
