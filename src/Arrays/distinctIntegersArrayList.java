package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
//Write a method that removes the duplicate elements from an array list of integers
public class distinctIntegersArrayList {
    public static void main(String[] args){
        System.out.println("Add 10 ints: ");
        Scanner inputLine = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(inputLine.nextInt());
        }
        removeDuplicates(list);
    }
    public static void removeDuplicates(ArrayList<Integer> list) {
       ArrayList newList = new ArrayList<>();
        for (Integer integer : list) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        System.out.println(newList);
    }
}
