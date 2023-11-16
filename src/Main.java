import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = scanner.nextInt();
        System.out.println("Среднее арифметическое элементов массива = " + number(size));
    }

    public static int number(int example) {

        Scanner scanner2 = new Scanner(System.in);


        int[] array = new int[example];

        System.out.println("Введите " + example + " числовых числовых элемента массива:");

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner2.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }


        return  (result / array.length);

    }
}
