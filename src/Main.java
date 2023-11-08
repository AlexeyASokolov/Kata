import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива:");

        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите " + size + " числовых числовых элемента массива:");

        int j = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }


        System.out.println("Среднее арифметическое элементов массива = " + result / array.length);

    }
}