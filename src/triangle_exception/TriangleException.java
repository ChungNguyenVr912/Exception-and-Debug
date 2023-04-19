package triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int area;
        int side1, side2, side3;
        do {
            area = 0;
            System.out.println("Input 3 sides of triangle:");
            System.out.print("Side1: ");
            try {
                side1 = scanner.nextInt();
                System.out.print("\nSide2: ");
                side2 = scanner.nextInt();
                System.out.print("\nSide3: ");
                side3 = scanner.nextInt();
                isInvalidSide(side1, side2, side3);
                area = side1 + side2 + side3;
            } catch (InputMismatchException e) {
                System.err.println("Invalid input!");
                scanner.nextLine();
            } catch (RuntimeException exception) {
                System.err.println("IllegalTriangleException");
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.err.println("???");
            }

        } while (area == 0);
        System.out.printf("Triangle area: %d", area);

    }

    public static boolean isInvalidSide(int a, int b, int c) throws RuntimeException {
        int max = Math.max(Math.max(a, b), c);
        double sum = a + b + c;
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException();
        } else if (max >= sum / 2) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }
}


