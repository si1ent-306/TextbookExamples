package FilesAndIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePractice {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        if(file.exists()){
            System.out.println("File exists already");
        }
        try(PrintWriter output = new PrintWriter(file);) {
            output.print("John T Smtih ");
            output.println(90);
            output.print("Erik K Smtih ");
            output.println(80);

        }
        Scanner input = new Scanner(file);
        while ((input.hasNext())){
            String firstname = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstname + " " + mi + " " + lastName + " " + score);
        }
    }
}
