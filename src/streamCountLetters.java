import com.sun.source.tree.Tree;

import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamCountLetters {
    private static int count = 0;
    public static void main(String[] args){
        Random random = new Random();
        Object[] chars = random.ints(100, (int)'a', (int)'z' + 1 )
                .mapToObj(value -> (char)value)
                .toArray();
        System.out.println("Lowercase Letters are: ");
        Stream.of(chars).forEach(o -> {
            System.out.print(o + (++count % 20 == 0 ? "\n" : " "));
        });
        count = 0;
        System.out.println("Occurences of each letter: ");
        Stream.of(chars).collect(Collectors.groupingBy(o -> o,
                TreeMap::new, Collectors.counting())).forEach(((o, aLong) -> {
                    System.out.print(o + ":" + aLong
                    + (++count % 10 == 0 ? "\n" : " "));
        }));
    }
}
