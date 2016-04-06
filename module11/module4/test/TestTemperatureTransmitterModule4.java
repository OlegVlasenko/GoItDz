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

        double expendResult = constantcelsiy*(farangeyt-constant);
        double result = TemperatureTransmitter.farangeyt(farangeyt);

        Assert.assertEquals(expendResult, result);
    }

    @Test(timeout = 1000)
    public void testCelsiy() throws Exception{
        double constant = 32;
        double constantfarangeyt = (double) 9/5;
        double celsiy = 100;

        double expendResult = constantfarangeyt*celsiy+constant;
        double result = TemperatureTransmitter.celsiy(celsiy);

        Assert.assertEquals(expendResult, result);
    }
}
