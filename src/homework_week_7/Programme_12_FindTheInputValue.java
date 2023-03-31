package homework_week_7;

import java.util.Scanner;

/**
 * Write a programme that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12_FindTheInputValue {
    public static void main(String[] args) {
        // scanner declaration for reading the inout from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        // Object creation
        Programme_12_FindTheInputValue inputValue = new Programme_12_FindTheInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }

    // find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an ALPHABET");
        } else if (ch >='0' && ch <= '9'){
            System.out.println(ch + " is a DIGIT");
        } else {
            System.out.println(ch + " is a SYMBOL");
        }
    }
}
