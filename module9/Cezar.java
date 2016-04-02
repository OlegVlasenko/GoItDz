import java.util.Scanner;

public class Cezar {
    public static void main(String[] args){
        Print print = new Print();
        Decoder decoder = new Decoder();
        String message = "Flower, Tulip, Aster, Bouquet, Chamomile, Rose, Rosebush";
        System.out.print ("Текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java:\n"+message+"\n");
        System.out.print("Введите ключ, для шифрования методом Цезаря:   ");
        Scanner scanner = new Scanner (System.in);
        final int key= (Integer.parseInt (scanner.next())); // Считываем ключ
        StringBuilder encryption = decoder.encriptionMessage(message, key); // Зашифровуем сообщение
        String message1 = encryption.toString (); // переводим зашифрованое сообщение в строку, что бы его потом разшифровать
        StringBuilder decryption = decoder.decriptionMessage(message1, key); // разшифровуем сообщение
        print.print(encryption, decryption); // выводим результаты
    }
}
