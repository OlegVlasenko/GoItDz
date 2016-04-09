public class Octal {
    public String convertToOctal(String number){
        int numberInt = Integer.parseInt(number);
        StringBuilder octalString = new StringBuilder();
        octalString.append("");
        while (numberInt != 0){
            octalString.append(String.valueOf(numberInt % 8)); ;
            numberInt = numberInt / 8;
        }
        return octalString.reverse().toString();
    }

    public int convertToDecimal(String octal){
        StringBuilder octalString = new StringBuilder();
        octalString.append(octal);
        octal = octalString.reverse().toString();
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++){
            decimal += Math.pow(8, i) * (Character.getNumericValue(octal.charAt(i)));
        }
        return decimal;
    }
}
