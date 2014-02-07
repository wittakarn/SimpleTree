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
public class BinaryTreeManager implements Serializable {

    private BinaryTreeNode root;
    private int level;

    public void add(Object newNode) {
        BinaryTreeNode start = null, tmp = null;

        try {
            if (newNode != null) {
                tmp = new BinaryTreeNode(newNode, null, null);
                int value = (Integer) newNode;
                if (getRoot() == null) {
                    setRoot(tmp);
                } else {
                    start = getRoot();
                    while (true) {
                        int startValue = (Integer) start.getData();

                        if (startValue == value) {
                            System.out.println("Object: " + newNode + " has already existed in the tree.");
                            break;
                        } else {
                            if (startValue > value) {
                                if (start.getLeft() != null) {
                                    start = start.getLeft();
                                } else {
                                    start.setLeft(tmp);
                                    break;
                                }
                            } else {
                                if (start.getRight() != null) {
                                    start = start.getRight();
                                } else {
                                    start.setRight(tmp);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            start = null;
            tmp = null;
        }
    }

    public int getMaxLevel(BinaryTreeNode root, int countLevel) {
        BinaryTreeNode start;
        try {
            start = root;
            if (start == null) {
                if (countLevel > getLevel()) {
                    setLevel(countLevel);
                }
                return getLevel();
            } else if (start.getLeft() != null) {
                start = start.getLeft();
                countLevel++;
                return getMaxLevel(start, countLevel);
            } else if (start.getRight() != null) {
                start = start.getRight();
                countLevel++;
                return getMaxLevel(start, countLevel);
            } else {
                return getMaxLevel(null, countLevel);
            }
        } finally {
            start = null;
        }
    }

    /**
     * @return the root
     */
    public BinaryTreeNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }
}
