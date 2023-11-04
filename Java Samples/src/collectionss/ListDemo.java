package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());
        //conversion from list to set
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);


        //
    }
}
