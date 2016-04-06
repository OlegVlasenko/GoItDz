package module10.test;

import module10.Decoder;
import module10.WorkWithFiles;
import org.junit.Assert;
import org.junit.Test;

public class TestJUnitModule10 {
    @Test(timeout = 2000)
    public void testWriteFile() throws Exception{
        module10.Decoder decoder = new Decoder();
        String fileName = "test.txt";
        String text = "Hello, world!";
        int key = 3;
        text = decoder.encriptionMessage(text, key).toString();
        WorkWithFiles.write(fileName, text);

        Assert.assertEquals("Khoor, zruog!\n", WorkWithFiles.read(fileName).toString());
    }
}
