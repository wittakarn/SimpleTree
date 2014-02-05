/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wittakarn.tree.binary;

import java.io.Serializable;

/**
 *
 * @author Wittakarn
 */
public class BinaryTreeNode implements Serializable{
    private Object data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;
    
    public BinaryTreeNode(){}
    
    public BinaryTreeNode(Object data, BinaryTreeNode left, BinaryTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the left
     */
    public BinaryTreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryTreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    
}
