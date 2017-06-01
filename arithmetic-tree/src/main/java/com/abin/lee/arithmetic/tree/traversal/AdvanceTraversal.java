package com.abin.lee.arithmetic.tree.traversal;

import java.util.ArrayDeque;

/**
 * Created by abin on 2017/6/1 17:57.
 * arithmetic-svr
 * com.abin.lee.arithmetic.list.traversal
 * 广度遍历，深度遍历
 * http://outofmemory.cn/code-snippet/4189/biinary-tree-java
 * http://www.cnblogs.com/lscheng/archive/2013/09/11/3313947.html
 */
public class AdvanceTraversal {
    static TreeNode root;

    public AdvanceTraversal(int[] array) {
        root = makeBinaryTreeByArray(array, 1);
    }

    /**
     * 采用递归的方式创建一颗二叉树
     * 传入的是二叉树的数组表示法
     * 构造后是二叉树的二叉链表表示法
     */
    public static TreeNode makeBinaryTreeByArray(int[] array, int index) {
        if (index < array.length) {
            int value = array[index];
            if (value != 0) {
                TreeNode t = new TreeNode(value);
                array[index] = 0;
                t.left = makeBinaryTreeByArray(array, index * 2);
                t.right = makeBinaryTreeByArray(array, index * 2 + 1);
                return t;
            }
        }
        return null;
    }

    public static void depthTraversal() {
        if (null == root)
            return;
        ArrayDeque<TreeNode> stack = new ArrayDeque<TreeNode>();
        stack.push(root);
        while (stack.isEmpty() == false) {
            TreeNode treeNode = stack.pop();
            System.out.print(treeNode.value+"    ");
            if (treeNode.right != null)
                stack.push(treeNode.right);
            if (treeNode.left != null)
                stack.push(treeNode.left);
        }
        System.out.print("\n");
    }


    public static void spanTraversal() {

    }

    /**
     *                  13
     *                 /  \
     *               65    5
     *              /  \    \
     *             97  25   37
     *            /    /\   /
     *           22   4 28 32
     */
    public static void main(String[] args) {
        int[] arr={0,13,65,5,97,25,0,37,22,0,4,28,0,0,32,0};
        AdvanceTraversal tree=new AdvanceTraversal(arr);
        tree.depthTraversal();
        tree.spanTraversal();
    }


}
