package com.abin.lee.arithmetic.tree.traversal.test;

import com.abin.lee.arithmetic.common.util.JsonUtil;

import java.util.ArrayDeque;

/**
 * Created by abin on 2017/6/20 11:54.
 * arithmetic-svr
 * com.abin.lee.arithmetic.tree.traversal.test
 */
public class AdvanceTraversal1 {

    static TreeNode1 root;

    public AdvanceTraversal1(int[] array) {
        root = makeBinaryTreeByArray(array, 1);
    }

    /**
     * 采用递归的方式创建一颗二叉树
     * 传入的是二叉树的数组表示法
     * 构造后是二叉树的二叉链表表示法
     */
    public static TreeNode1 makeBinaryTreeByArray(int[] array, int index) {
        if (index < array.length) {
            int value = array[index];
            if (value != 0) {
                TreeNode1 t = new TreeNode1(value);
                array[index] = 0;
                t.left = makeBinaryTreeByArray(array, index * 2);
                t.right = makeBinaryTreeByArray(array, index * 2 + 1);
                return t;
            }
        }
        return null;
    }



    public static void depthTraversal(){
        if(null == root)
            return;
        ArrayDeque<TreeNode1> stack = new ArrayDeque<TreeNode1>();
        stack.push(root);
        while(stack.isEmpty() == false){
            TreeNode1 treeNode1 = stack.pop();
            System.out.print(treeNode1.value + " ");
            if(treeNode1.right != null)
                stack.push(treeNode1.right);
            if(treeNode1.left != null)
                stack.push(treeNode1.left);
        }
        System.out.print("\n");
    }

    public static void spanTraversal(){
        if(null == root)
            return;
        ArrayDeque<TreeNode1> queue = new ArrayDeque<TreeNode1>();
        queue.add(root);
        while(queue.isEmpty() == false){
            TreeNode1 treeNode1 = queue.remove();
            System.out.print(treeNode1.value + " ");
            if(treeNode1.left != null){
                queue.add(treeNode1.left);
            }
            if(treeNode1.right != null){
                queue.add(treeNode1.right);
            }
        }
        System.out.print("\n");
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
        AdvanceTraversal1 tree=new AdvanceTraversal1(arr);
        System.out.println("root==---------" + JsonUtil.toJson(root));
//        tree.depthTraversal();
        tree.spanTraversal();
    }



}
