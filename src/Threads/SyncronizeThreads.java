package Threads;

public class SyncronizeThreads {
    public static int sum = 0;
    public static void main(String[] args){
        //Write a program that launches 1,000 threads.
        //Each thread adds 1 to a variable sum that initially is 0.
        //You need to pass sum by reference to each thread.
        //In order to pass it by reference, define an Integer wrapper object to hold sum.
        //Run the program with and without synchronization to see its effect.
        Runnable changeSumRunnable = new changeSum();

            Thread newThread = new Thread(changeSumRunnable);
            newThread.start();

    }
    public static class changeSum extends Thread implements Runnable {
        @Override
        public void run() {
            while (sum != 1000) {
                System.out.println(sum++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
