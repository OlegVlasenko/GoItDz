import java.util.Scanner;
// в коде есть почти одинаковый код, предлагаю заменить его методами
public class MyProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию (+, -, *, /): ");
        String comand = scanner.next();
        switch (comand){
            case "+":
                operation("+");
                break;
            case "-":
                operation("-");
                break;
            case "*":
                operation("*");
                break;
            case "/":
                operation("/");
                break;
            default:
                System.out.print("Введите одну из операций, которые указыны в скобках.");
                break;
        }
    }

    private static void operation(String comand){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число " + comand + " второе число: ");
        System.out.print("первое число: ");
        String aString = scanner.next();
        Double a = Double.parseDouble(aString);
        System.out.print("второе число: ");
        String bString = scanner.next();
        Double b = Double.parseDouble(bString);
        switch (comand){
            case "/":
                System.out.print(a + comand + b + " = " + (a / b));
                break;
            case "+":
                System.out.print(a + comand + b + " = " + (a + b));
                break;
            case "-":
                System.out.print(a + comand + b + " = " + (a - b));
                break;
            case "*":
                System.out.print(a + comand + b + " = " + (a * b));
                break;
        }
    }
}
