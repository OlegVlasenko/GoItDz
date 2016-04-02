import java.io.*;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {
        try {
            Decoder decoder = new Decoder();
            Scanner scanner = new Scanner(System.in);
            String text = "Hello, Java!";
            System.out.println("Текст, который будет зашифрован и записан в файл: " + text);
            System.out.print("Введите ключ для шифрования содержимого файла:   ");
            String keyString = scanner.nextLine();
            int key = Integer.parseInt(keyString);
            text = decoder.encriptionMessage(text, key).toString();
            write("firstFile.txt", text);
            System.out.println("Содержимое зашифрованого файла: ");
            System.out.println(read("firstFile.txt"));
            text = decoder.decriptionMessage(text, key).toString();
            System.out.println("Содержимое файла после расшифровки текста: " + text);
        }catch (NumberFormatException e){
            System.err.println("ключ должен быть в виде целого числа");
        }
    }

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        File file = new File(fileName);
        exists(fileName);

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}
