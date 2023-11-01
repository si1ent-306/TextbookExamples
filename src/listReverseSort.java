import java.util.Arrays;

public class listReverseSort {
    public static void main(String[] args){
        int[] list = {1,2,3,5,4};
        System.out.println(Arrays.toString(reverse(list)));
       java.util.Arrays.parallelSort(list);
       System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(reverse(list)));
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for(int i = 0, j = list.length-1; i < list.length; i++, j--){
            result[j] = list[i];
            char[] a = new char[100];

        }
        return result;
    }
}
