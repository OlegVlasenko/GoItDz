import org.junit.Assert;

public class Test {

    @org.junit.Test(timeout = 1000)
    public void testConvertToBinary(){
        Binary binary = new Binary();
        String number = "2347";

        Assert.assertEquals("100100101011", binary.convertToBinary(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToDecimal(){
        Binary binary = new Binary();
        String number = "101000110101";

        Assert.assertEquals("2613", binary.convertToDecimal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToOctal(){
        Octal octal = new Octal();
        String number = "2347";

        Assert.assertEquals("4453", octal.convertToOctal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToBinaryFromOctal(){
        Octal octal = new Octal();
        String number = "4453";

        Assert.assertEquals("100100101011", octal.convertToBinary(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToHexadecimal(){
        Hexadecimal hexadecimal = new Hexadecimal();
        String number = "3283982";

        Assert.assertEquals("321C0E", hexadecimal.convertToHexadecimal(number));
    }

    @org.junit.Test(timeout = 1000)
    public void testConvertToBinaryFromHexadecimal(){
        Hexadecimal hexadecimal = new Hexadecimal();
        String number = "321C0E";

        Assert.assertEquals("1100100001110000001110", hexadecimal.convertToBinary(number));
    }
}
