import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("paris");
        set.add("New York");
        set.add("San Fransisco");
        set.add("Beijing");

        System.out.println(set);
        System.out.println("set size : " + set.size());
        set.remove("London");
        System.out.println(set);
        System.out.println("set size : " + set.size());

        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("paris");
        set2.add("Shanghi");
        System.out.println(set2);
        System.out.println("set2 size : " + set2.size());
        set.addAll(set2);
        System.out.println("set after adding set 2 : " + set);
        System.out.println("set size after adding set 2 : " + set.size());
    }
}
