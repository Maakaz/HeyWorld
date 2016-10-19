package Hello;

/**
 * Created by opilane on 19.10.2016.
 */
public class Time {
    public static void main() {
        int hour = 15;
        int minute = 23;
        int second = 24;
        int second_per_day = 86400;
        int seconds = (hour * 60 + minute)* 60 + second;
        int dayz = second_per_day - seconds;
        float percent = (seconds * 100)/second_per_day;
        System.out.println("Current time in seconds: " + seconds);
        System.out.println("Remaining time in seconds: " + dayz);
        System.out.printf("Percentage stuff of a day: %.4f ", percent);

        int hour_1 = 15;
        int minute_1 = 46;
        int second_1 = 30;
        int seconds_1 = (hour_1 * 60 + minute_1)* 60 + second_1;
        int passed = seconds_1 - seconds;
        System.out.println("\nSeconds are passed..since beginning " + passed);


    }
}
