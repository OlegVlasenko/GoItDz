package module5.test;

import module5.Array;
import org.junit.Assert;
import org.junit.Test;

public class TestJUnitModule5 {
    int[] array = {2, 4, 12, 1, 5};

    @Test(timeout = 1000)
    public void testMinArray() throws Exception {

        Assert.assertEquals(1, Array.min(array));
    }

    @Test(timeout = 1000)
    public void testMaxArray() throws Exception {

        Assert.assertEquals(12, Array.max(array));
    }

    @Test(timeout = 1000)
    public void testSortingArray() throws Exception {

        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 12}, Array.sorting(array));
    }
}
