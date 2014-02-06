package com.wittakarn.main;

import com.wittakarn.tree.binary.BinaryTreeManager;
import com.wittakarn.tree.binary.BinaryTreeNode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        BinaryTreeNode bTree1 = new BinaryTreeNode(new Integer(5), null, null);
//        BinaryTreeNode bTree2 = new BinaryTreeNode(new Integer(6), null, null);
//        BinaryTreeNode bTree3 = new BinaryTreeNode(new Integer(4), null, null);
//        BinaryTreeNode bTree4 = new BinaryTreeNode(new Integer(1), null, null);
        
        BinaryTreeManager manageTree = new BinaryTreeManager();
        manageTree.add(new Integer(7));
        manageTree.add(new Integer(9));
        manageTree.add(new Integer(4));
        manageTree.add(new Integer(1));
        manageTree.add(new Integer(2));
        manageTree.add(new Integer(5));
        
        System.out.println(manageTree.getRoot().getData());
        System.out.println(manageTree.getRoot().getRight().getData());
        System.out.println(manageTree.getRoot().getLeft().getData());
        System.out.println(manageTree.getRoot().getLeft().getLeft().getData());
        System.out.println(manageTree.getRoot().getLeft().getRight().getData());
        System.out.println(manageTree.getRoot().getLeft().getLeft().getRight().getData());
    }
}
