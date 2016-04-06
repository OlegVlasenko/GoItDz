package module4.test;

import module4.Area;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAreaModule4 {
    Area area;

    @Before
    public void createArea(){
        area = new Area();
    }

    @Test(timeout = 1000)
    public void testAreaTriangle() throws Exception{
        final double a = 3;
        final double ha = 5;

        Assert.assertEquals(0.5 * a * ha, area.areaTriangle(a, ha));
    }

    @Test(timeout = 1000)
    public void testAreaRectangle() throws Exception{
        final double a = 3;
        final double b = 5;

        Assert.assertEquals(a * b, area.areaRectangle(a, b));
    }

    @Test(timeout = 1000)
    public void testAreaCircle() throws Exception{
        final double r = 3;

        Assert.assertEquals(Math.PI * Math.pow(r, 2), area.areaCircle(r));
    }
}
