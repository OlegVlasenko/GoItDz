import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            String aString = scanner.next();
            double a = Double.parseDouble(aString);
            Runner.run(a);
        }catch (NumberFormatException e){
            System.out.println("Неверный ввод числа");
        }
    }
}
