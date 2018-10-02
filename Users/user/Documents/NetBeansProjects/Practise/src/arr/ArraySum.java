package arr;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
//        int[] reqem = {1, 2, 3, 4};
//        int sum = 0;
//        for(int i=0;i<reqem.length;i++){
//            sum +=reqem[i];
//        }
//        System.out.println("Sum : " + sum);

//        for (int i = 1; i < 11; i++) {
//            System.out.print("- ");
//            for (int j = 1; j < 11; j++) {
//                System.out.print("- ");
//            }
//            System.out.println(); 
//       }
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        int average = sum / numbers.length;
//        System.out.println("Average is : " + average);
        int[] numbers = {11, 12, 13, 15, 51};
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array: " + numbers[i]);
            boolean check = numbers[i] > numbers[i + 1];
            min = numbers[i];

        }
        System.out.println("Min: " + min);
    }
}
