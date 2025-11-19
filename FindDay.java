
import java.time.LocalDate;
import java.util.Scanner;

public class FindDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input format: 08 05 2015
        System.out.print("Enter month day year (e.g. 08 05 2015): ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String res = findDay(month, day, year);
        System.out.println(res);

        sc.close();
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }
}
