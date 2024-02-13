import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args){
        insertionSort(new int[]{1, 6, 3, 5, 65, 342, 132});
    }
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k>= 0 && list[k] > currentElement; k-- ){
                list[k+1] = list[k];
            }
            list[k +1] = currentElement;
        }
        System.out.println(Arrays.toString(list));
    }
}
