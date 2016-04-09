public class Binary {
    public String convertToBinary(String number){
        int numberInt = Integer.parseInt(number);
        StringBuilder binaryString = new StringBuilder();
        binaryString.append("");
        while (numberInt != 0){
            if (numberInt % 2 == 1){
                binaryString.append("1");
            }else {
                binaryString.append("0");
            }
            numberInt = numberInt / 2;
        }
        return binaryString.reverse().toString();
    }

    public int convertToDecimal(String binary){
        StringBuilder binaryString = new StringBuilder();
        binaryString.append(binary);
        binary = binaryString.reverse().toString();
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++){
            decimal += Math.pow(2, i) * (Character.getNumericValue(binary.charAt(i)));
        }
        return decimal;
    }
}
