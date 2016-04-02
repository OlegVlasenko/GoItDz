public class Print {
    // метод выводящий переменные типа StringBuilder на консоль
    void print(StringBuilder encryption, StringBuilder decryption){
        System.out.print("\n"+"Зашифрованное текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+encryption.toString ()+"\n");
        System.out.print("\n"+"Расшифрованое текстовое представление коллекци обьектов из " +
                " из Модуля 3: ООП в Java:\n"+decryption.toString ()+"\n");
    }
}
