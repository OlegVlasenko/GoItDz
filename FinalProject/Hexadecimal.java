public class Hexadecimal {
    public String convertToHexadecimal(String number){
        int numberInt = Integer.parseInt(number);
        StringBuilder hexadecimalString = new StringBuilder();
        hexadecimalString.append("");
        int value;
        while (numberInt > 0){
            value = numberInt % 16;
            numberInt = numberInt / 16;
            switch (value){
                case 10:
                    hexadecimalString.append('A');
                    break;
                case 11:
                    hexadecimalString.append('B');
                    break;
                case 12:
                    hexadecimalString.append('C');
                    break;
                case 13:
                    hexadecimalString.append('D');
                    break;
                case 14:
                    hexadecimalString.append('E');
                    break;
                case 15:
                    hexadecimalString.append('F');
                    break;
                default:
                    hexadecimalString.append(Integer.toString(value));
                    break;
            }
        }
        return hexadecimalString.reverse().toString();
    }

    public int convertToDecimal(String hexadecimal){
        StringBuilder hexadecimalString = new StringBuilder();
        hexadecimalString.append(hexadecimal);
        hexadecimal = hexadecimalString.reverse().toString();
        int decimal = 0;
        int valueDecimal;
        for (int i = 0; i < hexadecimal.length(); i++){
            switch (Character.getNumericValue(hexadecimal.charAt(i))){
                case 'A':
                    valueDecimal = 10;
                    break;
                case 'B':
                    valueDecimal = 11;
                    break;
                case 'C':
                    valueDecimal = 12;
                    break;
                case 'D':
                    valueDecimal = 13;
                    break;
                case 'E':
                    valueDecimal = 14;
                    break;
                case 'F':
                    valueDecimal = 15;
                    break;
                default:
                    valueDecimal = Character.getNumericValue(hexadecimal.charAt(i));
                    break;
            }
            decimal += Math.pow(16, i) * valueDecimal;
        }
        return decimal;
    }
}
