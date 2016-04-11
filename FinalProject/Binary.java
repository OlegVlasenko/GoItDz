public class Binary {
    public String convertToBinary(String number){
        StringBuilder binaryString = new StringBuilder();
        try {
            int numberInt = Integer.parseInt(number);
            binaryString.append("");
            while (numberInt != 0) {
                binaryString.append(Integer.toString(numberInt % 2));
                numberInt = numberInt / 2;
            }
        }catch (NumberFormatException e){
            System.err.println("Enter the number");
        }

        return binaryString.reverse().toString();
    }

    public String convertToDecimal(String binary){
        StringBuilder binaryString = new StringBuilder();
        binaryString.append(binary);
        binary = binaryString.reverse().toString();
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++){
            decimal += Math.pow(2, i) * (Character.getNumericValue(binary.charAt(i)));
        }
        return Integer.toString(decimal);
    }
}
