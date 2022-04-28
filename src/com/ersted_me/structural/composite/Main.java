package com.ersted_me.structural.composite;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("First");
        Tree tree1 = new Tree("Second");
        Tree tree2 = new Tree("Third");

        Leaf leaf = new Leaf("leaf");
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");

        tree.addTree(tree1);
        tree.addTree(tree2);

        tree.addLeaf(leaf);
        tree.addLeaf(leaf1);
        tree2.addLeaf(leaf2);
    }
}
