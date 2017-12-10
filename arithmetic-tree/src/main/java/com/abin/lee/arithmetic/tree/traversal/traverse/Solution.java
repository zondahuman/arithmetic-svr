package com.abin.lee.arithmetic.tree.traversal.traverse;

import com.abin.lee.arithmetic.common.util.JsonUtil;

import java.util.*;

/**
 * Created by abin on 2017/12/10 2017/12/10.
 * arithmetic-svr
 * com.abin.lee.arithmetic.list
 * https://www.cnblogs.com/theskulls/p/5125858.html
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        treeNode1.left = new TreeNode(15);
        treeNode1.right = new TreeNode(7);
        root.right = treeNode1;
        List<List<Integer>> list = levelOrder(root);
        System.out.println("list=" + JsonUtil.toJson(list));
    }

    public static List<List<Integer>> levelOrder1(TreeNode root) {
        // write your code here
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        List<List<Integer>> tree = new ArrayList<List<Integer>>();
        if(root == null)
            return tree;
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode head = queue.poll();
                list.add(head.val);
                if(head.left!=null){
                    queue.offer(head.left);
                }
                if(head.right!=null){
                    queue.offer(head.right);
                }
            }
            tree.add(list);
        }
        return tree;
    }
    /*
   * @param root: A Tree
   * @return: Level order a list of lists of integer
   */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(null == root) return list;
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                temp.add(node.val);
                if (node.left != null ){
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (null != temp && temp.size()>0)
                list.add(temp);
        }
        return list;
    }

    /**
     * Definition of TreeNode:
     */
    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

}
