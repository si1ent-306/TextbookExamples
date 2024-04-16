package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListReverse {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a number to add to the list");
        for(int i = 0; i < 10; i++) {
            list.add(inputLine.nextInt());
        }
        sort(list);
    }
    public static void sort(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        java.util.Collections.sort(list);
        for(int i = list.size() - 1; i >= 0; i-- ){
            list2.add(list.get(i));
        }
        System.out.println(list2);
    }
}
