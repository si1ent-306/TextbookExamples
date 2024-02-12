public class minumumElementGeneric {
    public static void main(String[] args){
        Integer[] integers = {10, 5, 3, 66, 23, 54};
        int min = min(integers);
        System.out.println(min);

    }
    public static <E extends Comparable<E>> E min(E[] list){
        E min = list[0];
        for(int i = 1; i < list.length; i++){
            if(min.compareTo(list[i]) > 0){
                min = list[i];
            }
        }
        return min;
    }
}
