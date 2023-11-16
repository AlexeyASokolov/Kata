package ArrayList.Test;

import java.util.Arrays;

public class inverseArray {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 2, 17};
        int[] array2 = {543};
        int[] array3 = {14, 16, 3};
        int[] array4 = {876543, 44, 443, 76, 876, 876, 3456};
        int[] array5 = {543, 4, 3, 6, 76, 346};
        System.out.println(Arrays.toString(inverseArray(array1)));
        System.out.println(Arrays.toString(inverseArray(array2)));
        System.out.println(Arrays.toString(inverseArray(array3)));
        System.out.println(Arrays.toString(inverseArray(array4)));
        System.out.println(Arrays.toString(inverseArray(array5)));
    }

    public static int[] inverseArray(int[] numbers) {
        //твой код тут
        if (numbers.length == 0) {
            return new int[0];
        } else if (numbers.length == 1) {
            return numbers;
        } else {
            int[] array = new int[numbers.length];
            int i = 0;
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (j >= 0) {
                    array[j] = numbers[i];
                    ++i;

                }
            }
            return array;
        }
    }
}
