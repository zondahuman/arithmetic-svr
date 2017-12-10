package com.abin.lee.arithmetic.tree.traversal.common;

import java.io.Serializable;

/**
 * Created by abin on 2017/6/1 19:37.
 * arithmetic-svr
 * com.abin.lee.arithmetic.tree.traversal
 */
public class TreeNode implements Serializable{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value){
        this.value=value;
    }

}
