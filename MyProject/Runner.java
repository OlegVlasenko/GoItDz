import java.util.Scanner;

public class Runner {
    public static void run(double a) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите операцию(+, -, /, *): ");
            String comand = scanner.next();
            if (comand.equals("=")) {
                System.out.println(a);
                break;
            }
            if (comand.equals("+") || comand.equals("-") || comand.equals("*") || comand.equals("/")){
                a = operation(comand, a);
            }else {
                System.err.println("Неверный ввод команды, вводите команды, которые описаны в круглых скобках.\nПопробуйте снова");
            }
            System.out.println(a);
        }
    }
    private static double operation(String comand, double a){
        String bString;
        double b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите следующее число: ");
        try {
            bString = scanner.next();
            b = Double.parseDouble(bString);
            switch (comand){
                case "+":
                    a = a + b;
                    break;
                case "-":
                    a = a - b;
                    break;
                case "*":
                    a = (double) a * b;
                    break;
                case "/":
                    a = (double) a / b;
                    break;
            }
        }catch (NumberFormatException e){
            System.err.println("Неверный ввод числа, попробуйте снова");
        }
        return a;
    }
}
