import java.util.ArrayList;
import java.util.Collection;

public class testCollection {
    public static void main(String[] args){
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("Collection 1 : "+ collection1);
        System.out.println("Dallas in Collection 1 : "+ collection1.contains("Dallas"));

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println("Collection 2 : "+ collection2);

        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        c1.addAll(collection2);
        System.out.println("C1 has both collection 1 and 2 : "+ c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.retainAll(collection2);
        System.out.println("C1 has cities in both collection 1 and 2 : "+ c1);

        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);
        System.out.println("C1 has cities in  collection 1 but not 2 : "+ c1);

        collection1.forEach(e -> System.out.print(e.toUpperCase() + " "));
    }
}
