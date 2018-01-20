package com.edisoft.repeatremover;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for remover
 */
public class RepeatRemoverTest {

    // Lists for removeRepSuccesNumbers()
    private static List<Integer> LIST_1 = new LinkedList<Integer>(Arrays.asList(1, 1, 1, 1));
    private static List<Integer> LIST_2 = new LinkedList<Integer>(Arrays.asList(4, 5, 7, 1, 1, 1, 1));
    private static List<Integer> LIST_3 = new LinkedList<Integer>(Arrays.asList(2, 2, 2, 2, 4, 5, 7, 1, 1, 1, 1));
    private static List<Integer> LIST_4 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 2, 2, 4, 5, 7, 1, 1, 1, 1));
    private static List<Integer> EXPECTED_LIST_1 = new LinkedList<Integer>();
    private static List<Integer> EXPECTED_LIST_2 = new LinkedList<Integer>(Arrays.asList(4, 5, 7));
    private static List<Integer> EXPECTED_LIST_3 = new LinkedList<Integer>(Arrays.asList(4, 5, 7));
    private static List<Integer> EXPECTED_LIST_4 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7));

    // Lists for removeRepNumbers()
    private static List<Integer> LIST_5 = new LinkedList<Integer>(Arrays.asList(1, 1, 1, 1));
    private static List<Integer> LIST_6 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 5, 1, 1, 6));
    private static List<Integer> LIST_7 = new LinkedList<Integer>(Arrays.asList(2, 2, 2, 2, 4, 2, 7, 1, 1, 1, 1));
    private static List<Integer> LIST_8 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 2, 2, 4, 5, 7, 1, 1, 1, 1));
    private static List<Integer> EXPECTED_LIST_5 = new LinkedList<Integer>();
    private static List<Integer> EXPECTED_LIST_6 = new LinkedList<Integer>(Arrays.asList(2, 3, 4, 5, 6));
    private static List<Integer> EXPECTED_LIST_7 = new LinkedList<Integer>(Arrays.asList(4, 7));
    private static List<Integer> EXPECTED_LIST_8 = new LinkedList<Integer>(Arrays.asList(3, 4, 5, 7));


    @Test
    public void removeRepSuccesNumbers() {

        RepeatRemover.removeRepSuccesNumbers(LIST_1);
        RepeatRemover.removeRepSuccesNumbers(LIST_2);
        RepeatRemover.removeRepSuccesNumbers(LIST_3);
        RepeatRemover.removeRepSuccesNumbers(LIST_4);
        assertArrayEquals("EXPECTED_LIST_1 and LIST1 are different", EXPECTED_LIST_1.toArray(), LIST_1.toArray());
        assertArrayEquals("EXPECTED_LIST_2 and LIST2 are different", EXPECTED_LIST_2.toArray(), LIST_2.toArray());
        assertArrayEquals("EXPECTED_LIST_3 and LIST3 are different", EXPECTED_LIST_3.toArray(), LIST_3.toArray());
        assertArrayEquals("EXPECTED_LIST_4 and LIST4 are different", EXPECTED_LIST_4.toArray(), LIST_4.toArray());

    }

    @Test
    public void removeRepNumbers() {
        RepeatRemover.removeRepNumbers(LIST_5);
        RepeatRemover.removeRepNumbers(LIST_6);
        RepeatRemover.removeRepNumbers(LIST_7);
        RepeatRemover.removeRepNumbers(LIST_8);
        assertArrayEquals("EXPECTED_LIST_5 and LIST5 are different", EXPECTED_LIST_5.toArray(), LIST_5.toArray());
        assertArrayEquals("EXPECTED_LIST_6 and LIST6 are different", EXPECTED_LIST_6.toArray(), LIST_6.toArray());
        assertArrayEquals("EXPECTED_LIST_7 and LIST7 are different", EXPECTED_LIST_7.toArray(), LIST_7.toArray());
        assertArrayEquals("EXPECTED_LIST_8 and LIST8 are different", EXPECTED_LIST_8.toArray(), LIST_8.toArray());
    }
}