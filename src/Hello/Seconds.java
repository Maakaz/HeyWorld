package Hello;

import java.util.Scanner;

/**
 * Created by opilane on 19.10.2016.
 */
public class Seconds {
    public static void main() {
        int minute = 60;
        int second = 60;
        Scanner se = new Scanner(System.in);
        System.out.println("Enter some seconds: ");
        int sec = se.nextInt();
        int mod_h = sec%(minute*second);
        int hour = (sec - mod_h)/(minute*second);

        int second_2 = mod_h % second;
        int minute_3 = (mod_h - second_2)/(second);
        System.out.printf("%d seconds = %d hours, %d minutes and %d seconds ", sec, hour, minute_3, second_2);

    }
}
