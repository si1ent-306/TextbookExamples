package Arrays;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        bubbleSort(new int[]{54, 3, 2, 43, 87, 342, 532522, 0});

    }
    public static void bubbleSort(int[] list){
        boolean needNextPAss = true;
        for (int k = 1; k < list.length && needNextPAss; k++){
            needNextPAss = false;
            for (int i = 0; i < list.length - k; i++){
                if(list[i] > list[i + 1]){
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i+1] = temp;
                    needNextPAss = true;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
