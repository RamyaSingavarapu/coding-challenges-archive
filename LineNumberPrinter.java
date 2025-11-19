
import java.util.Scanner;

public class LineNumberPrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            i++;
            System.out.println(i + " " + data);
        }

        scanner.close();
    }
}
