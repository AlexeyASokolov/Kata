package ArrayList.Test;

import java.util.Arrays;

public class margeAndSort {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 4};
        int[] array2 = {6, 5, 8, 7};
        System.out.println(Arrays.toString(mergeAndSort(array1, array2)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        //твой код тут
        int[] preArray = new int[firstArray.length + secondArray.length];
        int countLength = 0;
        int countLength2 = 0;

        for (int z = 0; z < firstArray.length - 1; z++) {
            if (firstArray[z] > firstArray[z + 1]) {
                int max = firstArray[z];
                firstArray[z] = firstArray[z + 1];
                firstArray[z + 1] = max;
            }
        }
        for (int z = 0; z < secondArray.length - 1; z++) {
            if (secondArray[z] > secondArray[z + 1]) {
                int max = secondArray[z];
                secondArray[z] = secondArray[z + 1];
                secondArray[z + 1] = max;
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (countLength < firstArray.length) {
                preArray[countLength] = firstArray[i];
                countLength++;
            }

        }
        for (int i = secondArray.length; i < preArray.length; i++) {
            if (countLength2 < secondArray.length) {
                preArray[i] = secondArray[countLength2];
                countLength2++;
            }
        }


        return preArray;
    }
}

