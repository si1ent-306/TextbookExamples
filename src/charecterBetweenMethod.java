public class charecterBetweenMethod {
    public static void main(String[] args){

       printChars('1', 'z', 10);

    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int counter = 0;
        for(int i = ch1; i <= ch2; i++){
            System.out.print(ch1);
            ch1++;
            counter++;
            for (int f = numberPerLine; f == counter; f++){
                System.out.println();
            }

        }
    }
}
