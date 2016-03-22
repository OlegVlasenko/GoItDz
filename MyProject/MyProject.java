import java.util.Scanner;
// в коде есть почти одинаковый код, предлагаю заменить его методами
public class MyProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, *, /): ");
        String comand = scanner.next();
        String aString;
        String bString;
        double a;
        double b;
        switch (comand){
            case "+":
                System.out.println("Введите первое число " + comand + " второе число: ");
                System.out.print("первое число: ");
                aString = scanner.next();
                a = Double.parseDouble(aString);
                System.out.print("второе число: ");
                bString = scanner.next();
                b = Double.parseDouble(bString);
                System.out.print(a + comand + b + " = " + (a + b));
                break;
            case "-":
                System.out.println("Введите первое число " + comand + " второе число: ");
                System.out.print("первое число: ");
                aString = scanner.next();
                a = Double.parseDouble(aString);
                System.out.print("второе число: ");
                bString = scanner.next();
                b = Double.parseDouble(bString);
                System.out.print(a + comand + b + " = " + (a - b));
                break;
            case "*":
                System.out.println("Введите первое число " + comand + " второе число: ");
                System.out.print("первое число: ");
                aString = scanner.next();
                a = Double.parseDouble(aString);
                System.out.print("второе число: ");
                bString = scanner.next();
                b = Double.parseDouble(bString);
                System.out.print(a + comand + b + " = " + (a * b));
                break;
            case "/":
                System.out.println("Введите первое число " + comand + " второе число: ");
                System.out.print("первое число: ");
                aString = scanner.next();
                a = Double.parseDouble(aString);
                System.out.print("второе число: ");
                bString = scanner.next();
                b = Double.parseDouble(bString);
                System.out.print(a + comand + b + " = " + (a / b));
                break;
        }
    }
}
