package dev.peruch.ordenation;

import java.util.List;

public class Selectionsort {

    public List<Integer> sort(List<Integer> currentList){

        int lowestValue = 0;
        int lowestValueIndex = 0;
        int startIndex = 0;

        for(int i=startIndex; i < currentList.size(); i++){
           if(i==startIndex) {
               lowestValue = currentList.get(i);
           }else if (lowestValue > currentList.get(i)){
               lowestValue = currentList.get(i);
               lowestValueIndex = i;
           }

           if(i+1 == currentList.size()){
               int helper = currentList.get(startIndex);
               currentList.set(startIndex, lowestValue);
               currentList.set(lowestValueIndex, helper);
               i = startIndex++;
           }
        }

        return currentList;
    }
}
