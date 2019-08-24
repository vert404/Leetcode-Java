import java.util.HashMap;

/**
 * @author vert  @date 2019/8/24 10:29
 */
/*
459. 重复的子字符串(https://leetcode-cn.com/problems/repeated-substring-pattern/)
给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。

示例 1:
输入: "abab"
输出: True
解释: 可由子字符串 "ab" 重复两次构成。

示例 2:
输入: "aba"
输出: False

示例 3:
输入: "abcabcabcabc"
输出: True
解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */
public class Solution459 {
    public static void main(String[] args) {
        String string = "abcdabca";//"abcabc";
        Solution459 s = new Solution459();
        System.out.println(s.repeatedSubstringPattern(string));
    }

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if (s == null || len <= 1)
            return false;
        for (int i=1;i<=len/2;i++){//i最大时，对应最大子字符串为其一半
            if (len%i == 0){
                String str = s.substring(0,i);//待测试的子字符串不断变大
                int j = i;
                while (j<len && s.substring(j,j+i).equals(str)){//如果s为合乎要求的字符串，最后j会增加到len
                    j += i;
                }
                if (j == len){
                    return true;
                }
            }
        }
        return false;
    }
}
