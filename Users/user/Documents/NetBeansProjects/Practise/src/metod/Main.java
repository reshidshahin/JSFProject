package metod;

import java.util.Scanner;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a-ni daxil edin: ");
        int x = scanner.nextInt();
        System.out.println("b-ni daxil edin: ");
        int y = scanner.nextInt();
        int topladi = topla(x, y);
        int cixdi = cix(x, y);
        int vurdu = vur(x, y);
        int boldu = bol(x, y);
        System.out.println("Vurdu: " + vurdu);
    }

    public static int topla(int a, int b) {
        int netice = a + b;
        return netice;
    }

    public static int cix(int a, int b) {
        int netice = a - b;
        return netice;
    }

    public static int vur(int a, int b) {
        int netice = a * b;
        return netice;
    }

    public static int bol(int a, int b) {
        int netice = a / b;
        return netice;
    }
}
