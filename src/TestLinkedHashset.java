import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashset {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("paris");
        set.add("New York");
        set.add("San Fransisco");
        set.add("Beijing");

        System.out.println(set);
        System.out.println("set size : " + set.size());
    }
}
