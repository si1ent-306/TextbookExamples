package Threads;

public class MultithreadExample {
    public static void main(String[] args) {

        ThreadCounter threadCounter1 = new ThreadCounter();
        Thread threadCounter2 = new Thread(new RunnableCounter());
        threadCounter1.start();
        threadCounter2.start();

    }
}
