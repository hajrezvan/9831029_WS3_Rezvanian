package clockDisplay;

public class RunClass {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay(1,13,42);
        try {
            do {
                Thread.sleep(1000);
                clockDisplay.timeTick();
                System.out.println(clockDisplay.getTime());
            } while (true);
        } catch (InterruptedException e) {
            System.err.println("We have a Interrupt exception!!");
        }
    }
}