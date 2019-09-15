/**
 * @author vert  @date 2019/9/15 19:48
 */
/*
28. 实现 strStr()(https://leetcode-cn.com/problems/implement-strstr/)
实现 strStr() 函数。
给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

示例 1:
输入: haystack = "hello", needle = "ll"
输出: 2

示例 2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1

说明:
当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class Solution028 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "ll";
        Solution028 s = new Solution028();
        System.out.println(s.strStr(a,b));
    }
    //暴力解法
    /*public int strStr(String haystack, String needle) {
        int i = 0,j = 0,hLen = haystack.length(),nLen = needle.length();
        if (nLen == 0) return 0;
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        while(i < hLen && j < nLen){
            if (hay[i] == nee[j]){
                i++;
                j++;
            }
            else{
                i = i - j + 1;  //每次不匹配时i向后移一位重新开始匹配
                j = 0;
            }
        }
        if (j == nLen){
            return i - j;
        }else{
            return -1;
        }
    }*/
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int m = haystack.length(), n = needle.length();
        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();
        if (m < n) return -1;
        for (int i = 0; i <= m - n; ++i) {
            int j = 0;
            for (j = 0; j < n; ++j) {
                if (hay[i + j] != nee[j]) break;    //j每次加1，两数组进行判断，i加1对应hay中元素每次向后移一位进行判断
            }
            if (j == n) return i;
        }
        return -1;
    }
}
