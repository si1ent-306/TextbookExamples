import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        treeMap.forEach(
                (name, age) -> System.out.print(name + " : " + age + " ")
        );
    }
}
