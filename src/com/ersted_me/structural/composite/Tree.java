package com.ersted_me.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private final String name;
    private List<Tree> trees;
    private List<Leaf> leaves;

    public Tree(String name) {
        this.name = name;
        trees = new ArrayList<>();
        leaves = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }


    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public void addLeaf(Leaf leaf) {
        leaves.add(leaf);
    }
}
