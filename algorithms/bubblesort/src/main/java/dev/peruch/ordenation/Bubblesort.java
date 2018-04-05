package dev.peruch.ordenation;

import java.util.List;

public class Bubblesort {

    public List<Integer> sort(List<Integer> currentList){
        int startIndex = 0;
        boolean swapped = false;
        boolean swappedOnce = false;

        List<Integer> unorderedList = currentList;

        for (int i = startIndex; i < unorderedList.size(); i++ ){

            if (isOrdered(unorderedList, swapped, i)) {
                i = ++startIndex;
                swapped = false;
                swappedOnce = true;
            }
            if(!isCompletyIterated(unorderedList, i) &&
                isCurrentValueGreaterThenNextValue(unorderedList.get(i), unorderedList.get(nextPosition(i)))     ) {
                    unorderedList = swapValues(unorderedList, i);
                    showActualStatus(unorderedList, i);
                    swapped = true;
                }
            }
    return swappedOnce ? sort(unorderedList) : unorderedList;
    }

    private void showActualStatus(List<Integer> unorderedList, int index) {
        System.out.println("changed: " + unorderedList.get(nextPosition(index)) + " -> " + unorderedList.get(index));
        System.out.println("then: " + unorderedList.toString());
    }

    private List<Integer> swapValues(List<Integer> currentList, int index) {
        int helper;
        List<Integer> unorderedList = currentList;

        helper = unorderedList.get(nextPosition(index));
        unorderedList.set(nextPosition(index), unorderedList.get(index));
        unorderedList.set(index, helper);
        return unorderedList;
    }

    private boolean isOrdered(List<Integer> list, boolean swapped, int index){
        return !(nextPosition(index) < list.size()) && swapped;
    }

    private boolean isCompletyIterated(List<Integer> list, int index){
        return nextPosition(index) == list.size();
    }

    private boolean isCurrentValueGreaterThenNextValue(int current, int next) {
        return current > next;
    }

    private int nextPosition(int index){
        return ++index;
    }
}
