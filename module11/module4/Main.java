package module4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();
        Distance distance = new Distance();
        System.out.println(area.areaTriangle(2, 3));
        System.out.println(area.areaRectangle(12, 3));
        System.out.println(area.areaCircle(10));
        System.out.println(distance.distance(2, 3, 4, 2));
        System.out.println(TemperatureTransmitter.farangeyt(20));
        System.out.println(TemperatureTransmitter.celsiy(25));

        try {
            System.out.print("Введите длинну стороны треугольника: ");
            String aString = scanner.next();
            System.out.print("Введите высоту треугольника: ");
            String ahString = scanner.next();
            double a = Double.parseDouble(aString);
            double ah = Double.parseDouble(ahString);
            System.out.println("Площадь треугольника: " + area.areaTriangle(a, ah));
        }catch (NumberFormatException e){
            System.err.println("Надо вводить числа");
        }
    }
}
