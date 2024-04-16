package Threads;

public class ThreadPractice {
    public static void main(String[] args){
        Runnable printA = new printChar('a', 100);
        Runnable printB = new printChar('b', 100);
        Runnable print100 = new printNum(100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class printChar implements Runnable{
    private final char charToPrint;
    private final int numberOfPrints;

    public printChar(char c, int i) {
        charToPrint = c;
        numberOfPrints = i;
    }
    @Override
    public void run(){
        for(int i =0; i < numberOfPrints; i++){
            System.out.println(charToPrint);
        }
    }
}
class printNum implements Runnable{
    private final int numToPrint;

    public printNum(int n) {
        numToPrint = n;
    }
    @Override
    public void run(){
        for(int i =1; i < numToPrint; i++){
            System.out.println(i + " ");
        }
    }
}
