import java.time.LocalTime;

public class Stopwatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public Stopwatch() {
    }

    public Stopwatch(int startTime) {
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public LocalTime start(){
       return this.startTime = LocalTime.now();
    }
    public LocalTime end(){
        return this.endTime = LocalTime.now();
    }

    public static void main(String[] args){
        Stopwatch watch = new Stopwatch();
        watch.start();
        System.out.println(watch.start());
        watch.end();
        System.out.println(watch.end());

    }
}
