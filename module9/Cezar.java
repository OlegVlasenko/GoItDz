import java.util.Scanner;

public class Cezar {
    public static void main(String[] args){
        String message = "Flower, Tulip, Aster, Bouquet, Chamomile, Rose, Rosebush";
        System.out.print ("Текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java:\n"+message+"\n");
        System.out.print("Введите ключ, для шифрования методом Цезаря:   ");
        Scanner scanner = new Scanner (System.in);
        final int key= (Integer.parseInt (scanner.next())); // Считываем ключ
        StringBuilder encryption = encriptionMessage(message, key); // Зашифровуем сообщение
        String message1 = encryption.toString (); // переводим зашифрованое сообщение в строку, что бы его потом разшифровать
        StringBuilder decryption = decriptionMessage(message1, key); // разшифровуем сообщение
        print(encryption, decryption); // выводим результаты
    }


    //метод шифрования
    public static StringBuilder encriptionMessage(String message, int key){
        final int numberCharactersEngAlphabet = 26;
        StringBuilder encryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encryption.append((char) ('A' + (i - 'A' + (key%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet)) % numberCharactersEngAlphabet ));
                } else {
                    encryption.append((char) ('a' + (i - 'a' + (key%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet)) % numberCharactersEngAlphabet ));
                }
            } else {
                encryption.append(i);
            }
        }
        return encryption;
    }
    // метод разшифровки
    public static StringBuilder decriptionMessage(String message, int key){
        final int numberCharactersEngAlphabet = 26;
        StringBuilder decryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decryption.append((char) ('A' + (i - ('A' + (key%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet))%numberCharactersEngAlphabet) % numberCharactersEngAlphabet ));
                } else {
                    decryption.append((char) ('a' + (i - ('a' + (key%numberCharactersEngAlphabet
                            +numberCharactersEngAlphabet))%numberCharactersEngAlphabet) % numberCharactersEngAlphabet ));
                }
            } else {
                decryption.append(i);
            }
        }
        return decryption;
    }

    // метод выводящий переменные типа StringBuilder на консоль
    public static void print(StringBuilder encryption, StringBuilder decryption){
        System.out.print("\n"+"Зашифрованное текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+encryption.toString ()+"\n");
        System.out.print("\n"+"Расшифрованое текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+decryption.toString ()+"\n");
    }
}
