package javaprogramme3_handwrittenhomework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 **/

public class Programme_3_MarkSheet {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student name :  ");
        String name = scanner.next();
        System.out.println("Enter student roll no.    : ");
        int rollNum = scanner.nextInt();
        System.out.println("Enter marks of Subject Maths   :  ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {


            System.out.println("Invalid input marks should be between 0 to 100");
            System.out.println(" please enter correct marks ");
            mathMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of Subject Science");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {

            System.out.println("Invalid input Marks should be between 0 to 100");
            System.out.println("Please enter correct marks");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of Subject English");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input marks should be between 0 to 100");
            System.out.println("Please enter correct marks");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheetTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //closing scanner
        scanner.close();
    }

    // calculating sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculate result on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        String result = null;
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    //calculate the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {

        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";

            } else {
                grade = "-";
            }
        }
        return grade;

    }

    //Printing the marks sheet
    public static void printTheMarkSheetTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks,
                                                     double total, double percentage, String result, String grade) {

        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}




