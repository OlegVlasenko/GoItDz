package module4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Area.areaTriangle(2, 3));
        System.out.println(Area.areaRectangle(12, 3));
        System.out.println(Area.areaCircle(10));
        System.out.println(Distance.distance(2, 3, 4, 2));
        System.out.println(TemperatureTransmitter.farangeyt(20));
        System.out.println(TemperatureTransmitter.celsiy(25));

        try {
            System.out.print("Введите длинну стороны треугольника: ");
            String aString = scanner.next();
            System.out.print("Введите высоту треугольника: ");
            String ahString = scanner.next();
            double a = Double.parseDouble(aString);
            double ah = Double.parseDouble(ahString);
            System.out.println("Площадь треугольника: " + Area.areaTriangle(a, ah));
        }catch (NumberFormatException e){
            System.out.print("Надо вводить числа");
        }


    }
}
