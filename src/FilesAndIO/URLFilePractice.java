package FilesAndIO;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLFilePractice {
    public static void main(String[] args){
        System.out.println("Enter a url: ");
        //http://liveexample.pearsoncmg.com/data/Lincoln.txt
        String URLString = new Scanner(System.in).next();
        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while ((input.hasNext())){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("File size " + count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
