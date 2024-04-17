package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurrenceOfWords {
    public static void main(String[] args){
        String text = "Good Morning. Have a good Class." + "Have a good visit. Have fun!";
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split(("[\\s+\\p{P}]"));
//        for (String word : words) {
//            String key = word.toLowerCase();
//            if (!key.isEmpty()) {
//                if (!map.containsKey(key)) {
//                    map.put(key, 1);
//                } else {
//                    int value = map.get(key);
//                    value++;
//                    map.put(key, value);
//                }
//            }
//        }
        Arrays.stream(words)
                .map(String::toLowerCase)
                .filter(word -> !word.isEmpty())
                .forEach(word -> map.put(word, map.getOrDefault(word, 0) + 1));
        map.forEach((s, integer) -> System.out.println(s + " : " + integer));
    }
}
