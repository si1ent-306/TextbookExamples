import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class hashsetOperationg {
    public static void main(String[] args){
        //Create two linked hash sets and find their union,
        // difference,
        // and intersection.
        // (You can clone the sets to preserve the original sets from being changed by these set methods.)
        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>();
        LinkedHashSet<String> hashSet2 = new LinkedHashSet<>();
        hashSet1.add("George");
        hashSet1.add("Jim");
        hashSet1.add("john");
        hashSet1.add("Blake");
        hashSet1.add("Kevin");
        hashSet1.add("Michael");

        hashSet2.add("George");
        hashSet2.add("Katie");
        hashSet2.add("Kevin");
        hashSet2.add("MicHelle");
        hashSet2.add("Ryan");
        Set<String> c1 = (Set<String>) hashSet1.clone();
        Set<String> c2 = (Set<String>) hashSet2.clone();

        c1.retainAll(c2);
        System.out.println(c1);
        c1 = (Set<String>) hashSet1.clone();
        c1.removeAll(c2);
        System.out.println(c1);

    }
}
