package Hello;

/**
 * Created by opilane on 19.10.2016.
 */
public class Date {
    public static void main() {
        int date = 19;
        int year = 2016;
        String day = "Wendsday";
        String month = "October";
        System.out.println("American format: ");
        System.out.print(day);
        System.out.print(",");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(",");
        System.out.println(year);

        System.out.println("Europe format: ");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);

    }
}
