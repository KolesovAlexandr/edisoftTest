package com.edisoft.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple tree
 *
 * @param <T> type of value
 */
public class Tree<T> {

    private T value;
    private boolean visited;
    private List<Tree<T>> nodes = new ArrayList<Tree<T>>();

    /**
     * @param value typed value
     */
    public Tree(T value) {
        this.value = value;
    }


    /**
     * Method calculates height of tree, it uses DFS
     *
     * @param root root node
     * @param <T>  type of value
     * @return height
     */
    public static <T> int getHeight(Tree<T> root) {
        return root == null ? 0 : getHeight(root, 0, 0);
    }

    /**
     * DFS implementation
     *
     * @param root        root node
     * @param currentSize current branch size
     * @param maxHeight   current max height
     * @param <T>         type of value
     * @return int
     */
    private static <T> int getHeight(Tree<T> root, int currentSize, int maxHeight) {

        root.visited = true;
        currentSize++;
        for (Tree<T> node : root.nodes) {
            if (!node.visited) {
                maxHeight = getHeight(node, currentSize, maxHeight);
            }
        }
        return Math.max(currentSize, maxHeight);
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Tree<T>> getNodes() {
        return nodes;
    }
}
