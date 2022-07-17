import java.util.*;

    public class stopwatch {
    public static void main(String[] args) {
        System.out.println("This Is A StopWatch");
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("Press 1 to start time");
            scan.nextInt();
            startTime();
            System.out.println("Press 2 to start time");
            scan.nextInt();
            endTime();
            lapsTime();
        }
    }
    static double start = 0;
    static double stop = 0;
    public static  void startTime() {
        start = System.currentTimeMillis();
        System.out.println("Started At " + start);
        }
        public static void endTime() {
            stop = System.currentTimeMillis();
            System.out.println("Ended At " + stop);
        }
       public static void lapsTime(){
            System.out.println("Laps time " + (stop - start)/10000);
        }
        }
