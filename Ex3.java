package Lecture4;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year: ");
        int y = scanner.nextInt();
        if (y % 4 == 0 && y % 100 != 0) {
            System.out.println(y + " is a leap year.");
        } else if (y % 400 == 0) {
            System.out.println(y + " is a leap year.");
        } else {
            System.out.println(y + "is not a leap year.");
        }
    }
}
