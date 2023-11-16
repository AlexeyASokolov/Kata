package ArrayList.Test;

import java.util.Arrays;

public class getArrayMiddle {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 2, 17};
        int[] array2 = {543};
        int[] array3 = {14, 16, 3};
        int[] array4 = {876543, 44, 443, 76, 876, 876, 3456};
        int[] array5 = {543, 4, 3, 6, 76, 346};
        System.out.println(Arrays.toString(getArrayMiddleTest(array1)));
        System.out.println(Arrays.toString(getArrayMiddleTest(array2)));
        System.out.println(Arrays.toString(getArrayMiddleTest(array3)));
        System.out.println(Arrays.toString(getArrayMiddleTest(array4)));
        System.out.println(Arrays.toString(getArrayMiddleTest(array5)));

    }

    public static int[] getArrayMiddleTest(int[] numbers) {
//твой код тут
        if (numbers.length == 0) {
            return new int[0];
        } else if (numbers.length == 1) {
            return numbers;
        } else if (numbers.length == 2) {
            return numbers;
        } else if (numbers.length % 2 == 0) {

            int length = 0;
            for (int i = 0; i < numbers.length / 2; i++) {
                length++;
            }
            int[] array = new int[length];
            int index = 0;
            for (int i = 0; i < numbers.length / 2; i++) {

                array[index] = numbers[i];
                index++;

            }

            int[] array2 = new int[length];
            int index2 = length - 1;

            for (int i = numbers.length - 1; i > numbers.length / 2 - 1; i--) {
                if (index2 >= 0) {
                    array2[index2] = numbers[i];
                    index2--;
                }

            }
            int[] arrayResult1 = new int[2];
            arrayResult1[0] = array[1];
            arrayResult1[1] = array2[0];

            return arrayResult1;
        } else {
            int length = numbers.length / 2;
            int[] array3 = new int[length];
            int index3 = 0;
            for (int i = 0; i < numbers.length / 2 + 1; i++) {
                array3[index3] = numbers[i];
            }
            int[] arrayResult1 = new int[1];
            arrayResult1[0] = array3[0];

            return arrayResult1;
        }
    }
}
