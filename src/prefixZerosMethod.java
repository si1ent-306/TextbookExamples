public class prefixZerosMethod {
    public static void main(String[]args){
        String number = format(34, 4);
        System.out.println(number);
    }
    public static String format(int number, int width){
        String formatted = "";
        for(int i = 0; i < width; i++){
            formatted += "0";
        }
        formatted += number;
        return formatted;
    }
    //The method returns a string for the number with one or more prefix s.
    // The size of the string is the width.
    // For example, format(34, 4)  returns 0034.
    // If the number is longer than the width, the method returns the string representation for the number.
}
