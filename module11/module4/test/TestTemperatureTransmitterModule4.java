package module4.test;

import module4.TemperatureTransmitter;
import org.junit.Assert;
import org.junit.Test;

public class TestTemperatureTransmitterModule4 {
    @Test(timeout = 1000)
    public void testFarangeyt() throws Exception{
        double constant = 32;
        double constantcelsiy = (double) 5/9;
        double farangeyt = 100;

        Assert.assertEquals(constantcelsiy*(farangeyt-constant), TemperatureTransmitter.farangeyt(farangeyt));
    }

    @Test(timeout = 1000)
    public void testCelsiy() throws Exception{
        double constant = 32;
        double constantfarangeyt = (double) 9/5;
        double celsiy = 100;

        Assert.assertEquals(constantfarangeyt*celsiy+constant, TemperatureTransmitter.celsiy(celsiy));
    }
}
