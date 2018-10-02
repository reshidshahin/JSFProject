/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arr;

import java.util.Arrays;

/**
 *
 * @author Shahin_Rashidbayli
 */
public class MassivPractise {

    public static void main(String[] args) {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013,
            1458, 2458, 1254, 1472, 2365,
            1456, 2165, 1457, 2456};

        String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };
        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}
