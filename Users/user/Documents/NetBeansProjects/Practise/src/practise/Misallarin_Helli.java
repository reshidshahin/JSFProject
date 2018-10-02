package practise;
import java.util.Scanner;
/**
 *
 * @author Shahin_Rashidbayli
 */
public class Misallarin_Helli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktorial hesablamaq ucun reqem daxil edin:");
        int reqem = scanner.nextInt(); //5
        int faktorial = 1;
        for (int i = 1; i <= reqem; i++) {
            faktorial *= i;
        }
        System.out.println("Faktorial = " + faktorial);
    }
}
