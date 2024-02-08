import java.util.Scanner;

public class ArrayIndexOutOfBoundsTest {
    public static void main(String[] args){
        boolean check = true;
        while(check) {
            try {
                Scanner inputLine = new Scanner(System.in);
                int[] arrayRandom = new int[100];
                for (int i = 0; i < arrayRandom.length; i++) {
                    arrayRandom[i] = (int) ((Math.random() * 10) + 1);
                }
                System.out.print("Type the index you would like to find: ");
                int index = inputLine.nextInt();
                System.out.println(arrayRandom[index]);
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("Out of bounds");
                check = false;
            }
        }
    }
}
