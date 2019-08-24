/**
 * @author vert  @date 2019/8/24 19:20
 */
/*
在LeetCode中，TreeNode是经常用到的一个结构体，表示数据结构树（Tree）中的一个节点。其官方定义如下：
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
在Tree的题目中，常会给出一些测试用例，用一些特定的格式来表示一棵树，如[3,9,20,null,null,15,7]就表示如下的一棵树：

    3
   / \
  9  20
    /  \
   15   7
因此，我扩展了一下这个TreeNode的一些实现，使其可以通过官方给出的格式方便的构建出一棵树，
从而使得我们在自己写玩代码后能很方便地调试。

使用以上代码时，只需要使用该代码建立一个项目，再将其链接到你的工作代码中即可。调用静态函数mkTree即可把官方给出的Tree的格式转换为一棵树，非常简单，如下：

	String str = "[3,9,20,null,null,15,7]";
	TreeNode node = TreeNode.mkTree(str);
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }
    public String toString(){
        return Integer.toString(val);
    }

    //    int []arr = {3, 9, 20, Integer.MAX_VALUE, Integer.MAX_VALUE, 15, 7};
    private static int[] StrToIntArray(String str) {
        str = str.substring(1, str.length() - 1);
        String []strs = str.split(",");
        int []arr = new int[strs.length];

        for (int i = 0; i < arr.length; i++) {
            if (strs[i].equals("null")) {
                arr[i] = Integer.MAX_VALUE;
            } else {
                arr[i] = Integer.parseInt(strs[i]);
            }
        }

        return arr;
    }

    //    String str = "[3,9,20,null,null,15,7]";
    public static TreeNode mkTree(String str) {

        int []arr = StrToIntArray(str);
        TreeNode []nodes = new TreeNode[arr.length + 1];
        for (int i = 1; i < nodes.length; i++) {
            if (arr[i - 1] != Integer.MAX_VALUE) {
                nodes[i] = new TreeNode(arr[i - 1]);
            }else {
                nodes[i] = null;
            }
        }

        TreeNode node = null;
        for (int i = 1; i < nodes.length / 2; i++) {
            node = nodes[i];
            if (node == null) continue;
            node.left = nodes[2 * i];
            node.right = nodes[2 * i + 1];
        }
        return nodes[1];
    }
}
