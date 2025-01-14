package Lecture4;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input a: ");
        int a = scanner.nextInt();

        System.out.print("input b: ");
        int b = scanner.nextInt();

        System.out.print("input c: ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("The largest number is " + max);
    }
}
