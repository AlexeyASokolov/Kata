package ArrayList;

public class sdf {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
        System.out.println(isWeekend2("Saturday"));
        int[] array = {0, 6, 22, 90, 24, 92, 24, 94, 45, 67, 73, 39, 20};
        printArray(array);
    }


    public static boolean isWeekend(String weekday) {
        if (weekday == "Saturday" || weekday == "Sunday") {
            return true;
        } else if (weekday == "Monday" || weekday == "Tuesday" || weekday == "Wednesday" || weekday == "Thursday" || weekday == "Friday") {
            return false;
        } else {
            return false;
        }
    }

    public static String isWeekend2(String weekday) {
        return (weekday == "Saturday" || weekday == "Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }

    public static void printArray(int[] numbers) {
        //твой код тут
        System.out.print('[');
        if (numbers.length == 0) {
            System.out.print(']');
        } else {
            for (int i = 0; i < numbers.length; i++) {

                if (numbers.length - i > 1) {
                    System.out.print(numbers[i] + ", ");
                } else if (numbers.length - i >= 0) {
                    System.out.print(numbers[i]);
                    System.out.print(']');
                }
            }
        }
    }


}
