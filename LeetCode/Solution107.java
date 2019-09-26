import java.util.ArrayList;
import java.util.List;

/**
 * @author vert  @date 2019/9/24 23:39
 */
/*
107. 二叉树的层次遍历 II(https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)
给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）

例如：
给定二叉树 [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
返回其自底向上的层次遍历为：
[
  [15,7],
  [9,20],
  [3]
]
 */
public class Solution107 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        addVal(root,0,list);
        return list;
    }

    private void addVal(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null){
            return;
        }
        //如果 list 里队列的数量 大于 level，即层数，能正常添加值
        //如果 list 里队列的数量 小于或等于 level，则要添加新的队列
        if (list.size() <= level){
            list.add(0,new ArrayList<>()); //在list集合里添加新队列，在这之前的队列会向后移动
        }

        //添加当前值
        //list.size() 对于每一个递归来说，list传进来始终可能会变化，list.size() 值就会改变
        // 而 level 对于每一个递归来说，传进来此时的 level 值就不会变了
        list.get(list.size() - level - 1).add(root.val);

        addVal(root.left,level + 1,list);
        addVal(root.right,level + 1,list);
    }
}
