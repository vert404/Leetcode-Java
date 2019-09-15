/**
 * @author vert  @date 2019/9/15 13:49
 */
/*
14. 最长公共前缀(https://leetcode-cn.com/problems/longest-common-prefix/)
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

说明:
所有输入只包含小写字母 a-z 。
 */
public class Solution014 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Solution014 s = new Solution014();
        System.out.println(s.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        StringBuilder sb = new StringBuilder();
        int len = strs[0].length();
        for (int i=0;i<len;i++){
            char cur = strs[0].charAt(i);
            for (int j=0;j<strs.length;j++){
                if (strs[j].length() <= i || strs[j].charAt(i) != cur){
                    return sb.toString();
                }
                if (j == strs.length-1){
                    sb.append(cur);
                }
            }
        }
        return sb.toString();
    }
}
