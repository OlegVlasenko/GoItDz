public class Octal {
    public String convertToOctal(String number){
        StringBuilder octalString = new StringBuilder();
        try{
            int numberInt = Integer.parseInt(number);
            octalString.append("");
            while (numberInt != 0){
                octalString.append(String.valueOf(numberInt % 8)); ;
                numberInt = numberInt / 8;
            }
        }catch (NumberFormatException e){
            System.out.println("Enter the number");
        }
        return octalString.reverse().toString();
    }

    public String convertToBinary(String octal){
        Binary binary = new Binary();
        StringBuilder octalString = new StringBuilder();
        octalString.append(octal);
        octal = octalString.reverse().toString();
        int decimal = 0;
        for (int i = 0; i < octal.length(); i++){
            decimal += Math.pow(8, i) * (Character.getNumericValue(octal.charAt(i)));
        }
        return binary.convertToBinary(Integer.toString(decimal));
    }
}
