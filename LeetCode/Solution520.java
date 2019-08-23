/**
 * @author vert  @date 2019/8/23 23:07
 */
/*
520. 检测大写字母(https://leetcode-cn.com/problems/detect-capital/)
给定一个单词，你需要判断单词的大写使用是否正确。

我们定义，在以下情况时，单词的大写用法是正确的：
全部字母都是大写，比如"USA"。
单词中所有字母都不是大写，比如"leetcode"。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
否则，我们定义这个单词没有正确使用大写字母。

示例 1:
输入: "USA"
输出: True

示例 2:
输入: "FlaG"
输出: False
 */
public class Solution520 {
    public static void main(String[] args) {
        String word = "FlaG";//"USA";//"Google";
        Solution520 s = new Solution520();
        System.out.println(s.detectCapitalUse(word));
    }
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int upper = 0;//大写字母个数
        int lower = 0;//小写字母个数
        for (int i=0;i<len;i++){
            if (word.charAt(i) < 'a'){//判断是否为大写
                upper++;
            }else{
                lower++;
            }
        }
        if (upper == len) return true;//全大写
        if (lower == len) return true;//全小写
        if (word.charAt(0)<'a' && lower == len-1) return true;//首字母大写，其余小写
        return false;
    }
//    public boolean detectCapitalUse(String word) {
//        int len = word.length();
//        int m = 0,n=0;
//        if (word.charAt(0) < 'a'){//首字母大写
//            for (int i=1;i<len;i++){
//                if (word.charAt(i) < 'a'){
//                    m++;//大写
//                }else{
//                    n++;//小写
//                }
//            }
//            if (m == (len-1) || n == (len-1))//其余都是大写或小写
//                return true;
//        }else{//首字母小写
//            for (int j=1;j<len;j++){
//                if (word.charAt(j) >= 'a')
//                    n++;
//            }
//            if (n == len-1)//全小写
//        }
//        return false;
//    }
}
