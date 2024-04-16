public class mainMethodforCounter {
  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        counter.increment();
        System.out.println(counter.getCount());
      }
    });
    Thread thread2 = new Thread(thread1);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Final count: " + counter.getCount()); // Should be 2000
  }
}
