import java.util.*;

public class removeTheDuplicates {

    public static void main(String[] args) {
        System.out.println("Enter 10 values: ");
        Scanner inputLine = new Scanner(System.in);
        ArrayList<Integer> table = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int number = inputLine.nextInt();
            table.add(number);
        }
        System.out.println("Here are the unique values: ");
        removeDuplicates(table);

    }
    public static void removeDuplicates(ArrayList<Integer> list){
        HashSet<Integer> hset = new HashSet<>(list);
        System.out.println(hset);
        ArrayList<Integer> arrayList = new ArrayList<>(hset);
        System.out.println(arrayList);
    }
}
