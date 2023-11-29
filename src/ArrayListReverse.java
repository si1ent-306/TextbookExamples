import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(1);
        list.add(3);
        sort(list);
    }
    public static void sort(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        java.util.Collections.sort(list);
        for(int i = list.size() - 1; i >= 0; i-- ){
            int j = 0;
            list2.add(list.get(i));
        }
        System.out.println(list2);
    }
}
