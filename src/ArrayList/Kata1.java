package ArrayList;
import  java.lang.*;

import static java.lang.Math.abs;

public class Kata1 {
    public static void main(String[] args) {
        System.out.println(drawisMonitorsCounter(4, 3));
        System.out.println(doubleExpression(3, 3, 6));
        System.out.println(doubleExpression(3, 3, 6));
        System.out.println(0x0bp3);
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        //Твой код здесь
        return monitors - programmers;

    }

    public static boolean doubleExpression(double a, double b, double c) {





        return Math.abs(c - (a + b)) <  0.0001;

    }



    public class Main
    {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }

        public static void calcCircleRadius(double area) {
            //Твой код тут
            double radius = Math.sqrt(area/Math.PI);
            System.out.printf("%.4f",radius );
        }

        public static void maxLongSqr() {
            //Твой код тут
            long lon = Long.MAX_VALUE;
            System.out.println(lon);
        }
    }

}


