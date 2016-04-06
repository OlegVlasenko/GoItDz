package module9.test;

import module9.Decoder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestModule9 {
    Decoder decoder;
    @Before
    public void createDecoder(){
        decoder = new Decoder();
    }

    @Test(timeout = 1000)
    public void testEncriptionMessage() throws Exception{
        String message = "My name is Alexey";
        int key = 1;

        Assert.assertEquals("Nz obnf jt Bmfyfz", decoder.encriptionMessage(message, key).toString());
    }

    @Test(timeout = 1000)
    public void testDecryptionMessage() throws Exception{
        String message = "Nz obnf jt Bmfyfz";
        int key = 1;

        Assert.assertEquals("My name is Alexey", decoder.decriptionMessage(message, key).toString());
    }
}
