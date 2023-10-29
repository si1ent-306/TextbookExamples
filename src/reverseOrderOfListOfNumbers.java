public class reverseOrderOfListOfNumbers {
    public static void main(String[] args){
        //Write a program that reads 10 integers
        int[] integers = {1,2,3,4,5,6,7,8,9,10};
        // then displays them in the reverse of the order in which they were read
        for (int i = integers.length-1; i >=0; i--){
            System.out.print(integers[i] +  " ");
        }
    }
}
