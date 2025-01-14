package Lecture4;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of kWh consumed: ");
        int a = scanner.nextInt();
        int s;
        if (a > 0 && a <= 50) {
            s = 1678 * a;
        } else if (a > 50 && a <= 100) {
            s = 1734 * a;
        } else if (a > 100 && a <= 200) {
            s = 2014 * a;
        } else {
            s = 2536 * a;
        }
        System.out.println("Total electricity cost: " + s);
    }
}
