package arr;

import java.util.Scanner;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class Massiv {

    public static void main(String[] args) {
        twoDimensional();
    }

    public static void oneDimensional() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massivin uzunlugunu daxil edin: ");
        int m_gelen = sc.nextInt();
        int[] reqemler = new int[m_gelen];
        for (int i = 0; i < reqemler.length; i++) {
            System.out.print(i + ". elementi daxil edin: ");
            reqemler[i] = sc.nextInt();
        }
        for (int i = 0; i < reqemler.length; i++) {
            System.out.println("reqemler[" + i + "] : " + reqemler[i]);

        }
    }

    public static void twoDimensional() {
        int[][] arr
                = {
                    {1, 2, 3}, // 3
                    {4, 5, 6},// 5
                    {7}// 7
                };
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[2][0]);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
