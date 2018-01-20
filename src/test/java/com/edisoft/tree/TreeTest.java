package com.edisoft.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for tree
 */
public class TreeTest {

    @Test
    public void getHeight() {

        assertEquals(0, Tree.getHeight(generateTree(0)));
        assertEquals(1, Tree.getHeight(generateTree(1)));
        assertEquals(2, Tree.getHeight(generateTree(2)));
        assertEquals(3, Tree.getHeight(generateTree(3)));
        assertEquals(4, Tree.getHeight(generateTree(4)));

    }

    /**
     * Method generates simple trees
     *
     * @param height of tree
     * @return tree
     */
    private static Tree<Integer> generateTree(int height) {

        Tree<Integer> tree = null;

        switch (height) {
            case 0: {
                break;
            }
            case 1: {
                tree = new Tree<Integer>(1);
                break;
            }
            case 2: {
                tree = new Tree<Integer>(2);
                tree.getNodes().add(new Tree<Integer>(1));
                tree.getNodes().add(new Tree<Integer>(3));
                break;
            }
            case 3: {
                tree = new Tree<Integer>(3);
                tree.getNodes().add(new Tree<Integer>(1));
                tree.getNodes().get(0).getNodes().add(new Tree<Integer>(0));
                tree.getNodes().get(0).getNodes().add(new Tree<Integer>(2));
                tree.getNodes().add(new Tree<Integer>(4));
                tree.getNodes().get(1).getNodes().add(new Tree<Integer>(2));
                tree.getNodes().get(1).getNodes().add(new Tree<Integer>(-1));
                break;
            }

            case 4: {
                tree = new Tree<Integer>(3);
                tree.getNodes().add(new Tree<Integer>(1));
                tree.getNodes().get(0).getNodes().add(new Tree<Integer>(0));
                tree.getNodes().get(0).getNodes().add(new Tree<Integer>(2));
                tree.getNodes().get(0).getNodes().add(new Tree<Integer>(46));
                tree.getNodes().get(0).getNodes().get(0).getNodes().add(new Tree<Integer>(10));
                tree.getNodes().add(new Tree<Integer>(1));
                tree.getNodes().get(1).getNodes().add(new Tree<Integer>(0));
                tree.getNodes().get(1).getNodes().add(new Tree<Integer>(2));
                tree.getNodes().get(1).getNodes().add(new Tree<Integer>(44));
                break;
            }


        }
        return tree;
    }
}