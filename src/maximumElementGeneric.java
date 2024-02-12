public class maximumElementGeneric {
    public static void main(String[] args){
        Integer[] integers = {10, 5, 3, 66, 23, 54};
        int max = max(integers);
        System.out.println(max);

    }
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i = 1; i < list.length; i++){
            if(max.compareTo(list[i]) < 0){
                max = list[i];
            }
        }
        return max;
    }
}
