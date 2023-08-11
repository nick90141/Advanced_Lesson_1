package task_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

    ArrayList<Integer> List = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            List.add(i);
        }

    Iterator<Integer> iterator = List.iterator();

    while (iterator.hasNext()){
        Integer element = iterator.next();
        System.out.print(element + " ");
    }
    }
}
