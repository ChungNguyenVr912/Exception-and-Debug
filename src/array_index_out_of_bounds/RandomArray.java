package array_index_out_of_bounds;

import java.util.Random;

public class RandomArray {
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[rd.nextInt(100)];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
