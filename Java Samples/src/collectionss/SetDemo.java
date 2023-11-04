package collectionss;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//unordered
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(2);
        set.add(10);
        System.out.println(set);
    }
}
