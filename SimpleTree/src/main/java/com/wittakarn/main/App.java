package com.wittakarn.main;

import com.wittakarn.tree.binary.BinaryTreeManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

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
        
        manageTree.add(new Integer(7));
    }
}
