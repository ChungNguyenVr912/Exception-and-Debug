package array_index_out_of_bounds;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Integer[] arr = RandomArray.createRandom();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nInput any index: ");
            try {
                int index = scanner.nextInt();
                if (index == -1) break;
                System.out.println("Value at index " + index + " is " + arr[index]);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Invalid input!");
                scanner.nextLine();
            }
        } while (true);

    }
}
