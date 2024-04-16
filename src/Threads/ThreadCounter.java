package Threads;

public class ThreadCounter extends Thread {
    @Override
    public void run() {
        for(int i = 10; i > 0; i-- ){
            System.out.println("Thread #1 : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread #1 finished");
    }
}
