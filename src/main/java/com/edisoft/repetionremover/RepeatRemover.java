package com.edisoft.repetionremover;

import java.util.*;

/**
 * Class to remove repeating numbers
 */
public class RepeatRemover {

    /**
     * method removes successively repeating numbers
     *
     * @param list with numbers
     */
    public static void removeRepSuccesNumbers(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            int prevNumber = list.get(0);
            int counter = 1;
            for (int i = 1; i < list.size(); i++) {
                if (prevNumber == list.get(i)) {
                    counter++;
                } else if (counter >= 3) {
                    removeRepRange(list, counter, i);
                    i -= counter;
                    counter = 1;
                }
                prevNumber = list.get(i);
            }
            if (counter >= 3) {
                removeRepRange(list, counter, list.size());
            }
        }

    }

    /**
     * method removes repeating numbers
     * numbersFotRemove is HashSet because method removeAll() uses method contains()
     *
     * @param list with numbers
     */
    public static void removeRepNumbers(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
            Map<Integer, Integer> numbersCounters = new HashMap<Integer, Integer>();
            Set<Integer> numbersForRemove = new HashSet<Integer>();
            for (Integer number : list) {

                Integer numberCounter = numbersCounters.get(number);
                if (numberCounter == null) {
                    numberCounter = 0;
                }
                numberCounter++;
                numbersCounters.put(number, numberCounter);
            }
            for (Map.Entry<Integer, Integer> entry : numbersCounters.entrySet()) {
                if (entry.getValue() >= 3) {
                    numbersForRemove.add(entry.getKey());
                }
            }
            list.removeAll(numbersForRemove);
        }

    }

    /**
     * Method removes all numbers before endIndex with shift
     *
     * @param list     with numbers
     * @param shift    backward shift
     * @param endIndex before this index repeating numbers finishes
     */
    private static void removeRepRange(List<Integer> list, int shift, int endIndex) {

        for (int j = endIndex - 1; j >= endIndex - shift; j--) {
            list.remove(j);
        }
    }

}
