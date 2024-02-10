import java.io.File;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a path's size to check: ");
        String path = inputLine.nextLine();
        System.out.println("size of "+ path + " is " + getSize(new File(path)) + " bytes");
    }

    private static int getSize(File file) {
        long size = 0;
        if(file.isDirectory()){
            File[] fileArray = file.listFiles();
            for(int i = 0; fileArray != null && i < fileArray.length; i++){
                size += getSize(fileArray[i]);
            }
        }else {
            size = file.length();
        }
        return (int)(size);
    }
}
