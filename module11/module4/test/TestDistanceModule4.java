package module4.test;

import module4.Distance;
import org.junit.Assert;
import org.junit.Test;

public class TestDistanceModule4 {

    @Test(timeout = 1000)
    public void testDistance() throws Exception{
        Distance distance = new Distance();

        double x1 = 2;
        double y1 = 0;
        double x2 = 2;
        double y2 = -2;

        Assert.assertEquals(2, distance.distance(x1, y1, x2, y2));
    }
}
