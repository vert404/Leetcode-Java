import java.util.ArrayList;
import java.util.List;

/**
 * @author vert  @date 2019/9/2 15:55
 */
/*
118. 杨辉三角(https://leetcode-cn.com/problems/pascals-triangle/)
给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。

在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:
输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

可以表示为
[1],
[1,1],
[1,2,1],
[1,3,3,1],
[1,4,6,4,1]
 */
public class Solution118 {
    public static void main(String[] args) {
        int numRows = 5;
        Solution118 s = new Solution118();
        List<List<Integer>> list = s.generate(numRows);
        for (List tmp : list) {
            System.out.println(tmp);
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);//一串List，取得第一个List，添加元素1
        for (int rowNum = 1; rowNum < numRows; rowNum++) { //行数
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);//get()得到某一行
            row.add(1);//添加第一个元素1
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));//每个数是它左上方和右上方的数的和
            }
            row.add(1);//末尾添加元素1
            triangle.add(row);//添加这一行
        }
        return triangle;
    }
}
