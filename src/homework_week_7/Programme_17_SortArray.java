package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17_SortArray {

    public static void main(String[] args) {
        // Numeric array declaration
        int[] numArray = {1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};

        // String array declaration
        String[] strArray = {"Alpha", "Bravo", "Delta", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual numerical Array was : " + Arrays.toString(numArray));
        // Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numerical Array is :" + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was : " + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : "+ Arrays.toString(strArray));
    }
}
