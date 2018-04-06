package dev.peruch.ordenation;

import java.util.List;

public class Bubblesort {

    public List<Integer> sort(List<Integer> currentList){
        int listSize;

        List<Integer> unorderedList = currentList;
        listSize = unorderedList.size();

        for (int i = 0; i < listSize; i++ ){
            if (isOrdered(listSize, i)) {
                listSize--;
                i = 0;
            }

            if(!isCompletyIterated(unorderedList, i) &&
                isCurrentValueGreaterThenNextValue(unorderedList.get(i), unorderedList.get(nextPosition(i)))     ) {
                    unorderedList = swapValues(unorderedList, i);
                    showActualStatus(unorderedList, i);
            }
        }

    return unorderedList;
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

    private boolean isOrdered(int listSize, int index){
        return !(nextPosition(index) < listSize);
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
