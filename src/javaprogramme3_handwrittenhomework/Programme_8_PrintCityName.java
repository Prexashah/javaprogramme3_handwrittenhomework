package javaprogramme3_handwrittenhomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme_8_PrintCityName {
    public static void main(String[] args) {
        //Scanner declaration for reading foam console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F :");
        char city = scanner.next().charAt(0);
        // Creating object to create method
        Programme_8_PrintCityName cityName = new Programme_8_PrintCityName();
        cityName.printCityName(city);
        scanner.close();
    }

    //Printing city name
    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Derby");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Felt-ham");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
