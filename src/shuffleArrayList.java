import java.util.ArrayList;
import java.util.Collections;

public class shuffleArrayList {
    public static void main(String[] args){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(10);
        integers.add(1000);
        integers.add(10000);
        integers.add(100000);
        integers.add(1000000);
        shuffle(integers);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("AA");
        strings.add("AAA");
        strings.add("AAAA");
        strings.add("AAAAA");
        strings.add("AAAAAA");
        shuffle(strings);

    }
    public static <E> void shuffle(ArrayList<E> list){
        System.out.println("Before the shuffle: " + list);
        Collections.shuffle(list);
        System.out.println("After the shuffle: " + list);

    }
}
