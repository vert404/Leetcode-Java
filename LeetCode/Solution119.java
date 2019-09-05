import java.util.ArrayList;
import java.util.List;

/**
 * @author vert  @date 2019/9/5 14:32
 */
/*
119. 杨辉三角 II(https://leetcode-cn.com/problems/pascals-triangle-ii/)
给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:
输入: 3
输出: [1,3,3,1]

进阶：
你可以优化你的算法到 O(k) 空间复杂度吗？
 */
public class Solution119 {
    public static void main(String[] args) {
        int rowIndex = 3;
        Solution119 s = new Solution119();
        System.out.println(s.getRow(rowIndex));
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);//一串List，取得第一个List，添加元素1

        for (int rowNum = 1; rowNum <= rowIndex; rowNum++) { //行数
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);//get()得到某一行
            row.add(1);//添加第一个元素1
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));//每个数是它左上方和右上方的数的和
            }
            row.add(1);//末尾添加元素1
            triangle.add(row);//添加这一行
        }
        return triangle.get(rowIndex);
    }
}
