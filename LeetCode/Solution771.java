/**
 * @author vert  @date 2019/8/25 15:14
 */
/*
771. 宝石与石头(https://leetcode-cn.com/problems/jewels-and-stones/)

给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，
你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

示例 1:
输入: J = "aA", S = "aAAbbbb"
输出: 3

示例 2:
输入: J = "z", S = "ZZ"
输出: 0

注意:
S 和 J 最多含有50个字母。
 J 中的字符不重复。
 */
public class Solution771 {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        Solution771 s = new Solution771();
        System.out.println(s.numJewelsInStones(J,S));
    }
    //利用哈希思想
    public int numJewelsInStones(String J, String S) {
        int[] s = new int[128];
        int count = 0;
        for (char i : J.toCharArray()){
            s[i] = 1;//将全部不重复字母对应的s[i]赋值为1，i对应那些字母的十进制数
        }
        for (char i : S.toCharArray()){
            if (s[i] == 1){//s[i]表示那些字母，判断在数组中对应的值是否为1
                count++;
            }
        }
        return count;
    }
}
