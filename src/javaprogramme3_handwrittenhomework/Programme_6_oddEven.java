package javaprogramme3_handwrittenhomework;

import java.util.Scanner;

public class Programme_6_oddEven {
    public static void main(String[] args) {

        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int number = scanner.nextInt();
        Programme_6_oddEven oddEven = new Programme_6_oddEven();
        System.out.println(number + " is " + oddEven.isEvenOrOddNumber(number) + " number");
// closing scanner
        scanner.close();
    }

    //checking even or odd
    public String isEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}

