package ArrayList;

import java.util.Arrays;

public class ArrTest {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 9, 11, 24};
        int start = 4;
        int end = 10;
        int[] result = getSubArrayBetween(array, start, end);
        System.out.println(Arrays.toString(result));

    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        //твой код тут
        if (numbers.length == 0) {
            return new int[0];
        } else {
            int length = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= start && numbers[i] <= end) {
                    length++;
                }
            }


            int[] array = new int[length];
            int index = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= start && numbers[i] <= end) {
                    array[index] = numbers[i];
                    index++;
                }
            }
            return array;
        }
    }
}

