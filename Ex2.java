package Lecture4;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input Math scores: ");
        int a = scanner.nextInt();
        System.out.print("input Physics scores: ");
        int b = scanner.nextInt();
        System.out.print("input Chemistry scores: ");
        int c = scanner.nextInt();
        double average = (a + b + c) / 3;
        if (average >= 8) {
            System.out.println("Excellent");
        } else if (average >= 6.5 && average < 8) {
            System.out.println("Good");
        } else if (average >= 5 && average < 6.5) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }
}
