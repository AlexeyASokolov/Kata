package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
            int num = list.size();
            System.out.printf("Размер листа увеличили на 1,с помощью цикла for. Размер листа: %d единиц\n", num);
        }
        System.out.println("Закончили добавлять объекты. Размер листа: " + list.size());
        try {
            System.out.println(list.get(12));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Хочу увидеть значение под индексом: " + 12);
            System.out.printf("Значение под индексом %d не входит в list. Введите числа до %d.\n", 12, list.size());
        }
        System.out.println();
        for (Integer x : list) {
            System.out.printf("Вывожу значение %d под индексом %d, с помощью цикла for-each\n",list.get(x),list.get(x));

        }

        System.out.printf("Удаляем элемент по индексом %d из листа. Выводим массив на экран: %s",list.remove(2),list);

    }

}


