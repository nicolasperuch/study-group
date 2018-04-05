package dev.peruch.ordenation;

import java.util.List;

public class BubblesortInternet {

    public List<Integer> sort (List<Integer> arr){
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < arr.size() - 1; i++)
        {
            swapped = false;
            for (j = 0; j < arr.size() - i - 1; j++)
            {
                if (arr.get(j) > arr.get(j + 1))
                {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
        return arr;
    }
}
