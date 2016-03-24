import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            String aString = scanner.next();
            double a = Double.parseDouble(aString);
            Runner runner = new Runner();
            runner.run(a);
        }catch (NumberFormatException e){
            System.err.println("Неверный ввод числа");
        }
    }
}
