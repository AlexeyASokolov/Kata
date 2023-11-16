package ArrayList.Test;

import java.util.Arrays;

public class ArrrTest {
    public static void main(String[] args) {
        int[] array1 = {76543,6543};
        int[] array2 = {543};
        int[] array3 = {};
        int[] array4= {876543,44,443,76,876,876,3456};
        int[] array5 = {543,4,3,6,76,346};
        System.out.println(Arrays.toString(getSubArrayBetween(array1)));
        System.out.println(Arrays.toString(getSubArrayBetween(array2)));
        System.out.println(Arrays.toString(getSubArrayBetween(array3)));
        System.out.println(Arrays.toString(getSubArrayBetween(array4)));
        System.out.println(Arrays.toString(getSubArrayBetween(array5)));

    }

    public static int[] getSubArrayBetween(int[] numbers) {
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
                if (i < numbers.length / 2) {
                    length++;
                }
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
                array2[index2] = numbers[i];
                index2--;
            }
            int[] arrayResult1 = new int[2];
            arrayResult1[0] = array[2];
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
