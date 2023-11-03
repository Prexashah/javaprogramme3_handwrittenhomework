package javaprogramme3_handwrittenhomework;

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter the year ");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
    }

    //checking is it leap year or not
    public void isItLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is a Leap year");
        } else
            System.out.println("The year " + year + "is not a Leap year ");
    }
}
