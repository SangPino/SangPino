
package Lecture4;
import java.util.Scanner;
public class Ex8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = scanner.nextInt();
        System.out.print("Input b: ");
        int b = scanner.nextInt();
        System.out.print("Input c: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c)
                System.out.println("Equilateral");
            else if (a == b || a == c || b == c)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        } else
            System.out.println("The three sides not form a valid triangle.");
    }
}
    

