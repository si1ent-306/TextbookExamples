import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesGenerics {
    public static void main(String[] args){
        System.out.println("Enter 10 values: ");
        Scanner inputLine = new Scanner(System.in);
        ArrayList<Integer> table = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int number = inputLine.nextInt();
            table.add(number);
        }
        System.out.println("Here are the unique values: ");
        System.out.println(table);
        System.out.println(removeDuplicate(table));
    }
    public static <E> ArrayList<E> removeDuplicate(ArrayList<E> list){
        HashSet<E> hset = new HashSet<>(list);
        return new ArrayList<>(hset);
    }
}
