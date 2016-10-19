package Hello;

/**
 * Created by opilane on 19.10.2016.
 */
import java.util.Scanner;
public class Celsius {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
        int cels = sc.nextInt();
        int fahr = cels * (9/5) + 32;
        System.out.println("Those Celsius in Farhenheit: " + fahr);

    }
}
