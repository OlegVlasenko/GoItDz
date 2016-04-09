import org.junit.Assert;

public class Test {
    @org.junit.Test(timeout = 1000)
    public void testConvertToBinary(){
        Binary binary = new Binary();
        String number = "2347";

        Assert.assertEquals("100100101011", binary.convertToBinary(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToDecimalForBinary(){
        Binary binary = new Binary();
        String number = "101000100100001";

        Assert.assertEquals(20769, binary.convertToDecimal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToOctal(){
        Octal octal = new Octal();
        String number = "2347";

        Assert.assertEquals("4453", octal.convertToOctal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToDecimalForOctal(){
        Octal octal = new Octal();
        String number = "2347";

        Assert.assertEquals(1255, octal.convertToDecimal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToHexadecimal(){
        Hexadecimal hexadecimal = new Hexadecimal();
        String number = "3569";

        Assert.assertEquals("DF1", hexadecimal.convertToHexadecimal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToDecimalForHexadecimal(){
        Hexadecimal hexadecimal = new Hexadecimal();
        String number = "DF14";

        Assert.assertEquals(57108, hexadecimal.convertToDecimal(number));
    }
}
