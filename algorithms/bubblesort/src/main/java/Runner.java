import dev.peruch.ordenation.Bubblesort;
import dev.peruch.ordenation.BubblesortInternet;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Integer> unorderedList = new ArrayList<>();

        unorderedList.add(5);
        unorderedList.add(1);
        unorderedList.add(4);
        unorderedList.add(2);
        unorderedList.add(8);
        unorderedList.add(1);
        unorderedList.add(2);
        unorderedList.add(3);
        unorderedList.add(4);
        unorderedList.add(5);
        unorderedList.add(6);


        List<Integer> ordernedList;
        ordernedList = new Bubblesort().sort(unorderedList);
        System.out.println(" Final values : \n " + ordernedList);

        List<Integer> ordernedList2;
        ordernedList2 = new BubblesortInternet().sort(unorderedList);
        System.out.println(" Final values From Internet: \n " + ordernedList2);

    }
}
