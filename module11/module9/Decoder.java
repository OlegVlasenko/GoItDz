package module9;

public class Decoder {
    // метод разшифровки
    public char decryption(char firstLetter, char i, int key){
        int numberCharactersEngAlphabet = 26;
        return (char)(firstLetter + (i - (firstLetter + (key%numberCharactersEngAlphabet
                +numberCharactersEngAlphabet))%numberCharactersEngAlphabet) % numberCharactersEngAlphabet );
    }
    public char encription(char firstLetter, char i, int key){
        int numberCharactersEngAlphabet = 26;
        return (char) (firstLetter + (i - firstLetter + (key%numberCharactersEngAlphabet
                +numberCharactersEngAlphabet)) % numberCharactersEngAlphabet );
    }
    public StringBuilder decriptionMessage(String message, int key){
        StringBuilder decryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    decryption.append(decryption('A', i, key));
                } else {
                    decryption.append(decryption('a', i, key));
                }
            } else {
                decryption.append(i);
            }
        }
        return decryption;
    }
    //метод шифрования
    public StringBuilder encriptionMessage(String message, int key){
        final int numberCharactersEngAlphabet = 26;
        StringBuilder encryption = new StringBuilder();
        for (char i : message.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encryption.append(encription('A', i, key));
                } else {
                    encryption.append(encription('a', i, key));
                }
            } else {
                encryption.append(i);
            }
        }
        return encryption;
    }
}
