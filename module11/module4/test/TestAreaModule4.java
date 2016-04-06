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

        final double expectResult = 0.5 * a * ha;
        final double result = area.areaTriangle(a, ha);

        Assert.assertEquals(expectResult, result);
    }

    @Test(timeout = 1000)
    public void testAreaRectangle() throws Exception{
        final double a = 3;
        final double b = 5;

        final double expectResult = a * b;
        final double result = area.areaRectangle(a, b);

        Assert.assertEquals(expectResult, result);
    }

    @Test(timeout = 1000)
    public void testAreaCircle() throws Exception{
        final double r = 3;

        final double expectResult = Math.PI * Math.pow(r, 2);
        final double result = area.areaCircle(r);

        Assert.assertEquals(expectResult, result);
    }
}
