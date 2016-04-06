package module5.test;

import module5.Array;
import org.junit.Assert;
import org.junit.Test;

public class TestJUnitModule5 {
    int[] array = {2, 4, 12, 1, 5};

    @Test(timeout = 1000)
    public void testMinArray() throws Exception {
        int expectResult = 1;
        int result = Array.min(array);

        Assert.assertEquals(expectResult, result);
    }

    @Test(timeout = 1000)
    public void testMaxArray() throws Exception {
        int expectResult = 12;
        int result = Array.max(array);

        Assert.assertEquals(expectResult, result);
    }

    @Test(timeout = 1000)
    public void testSortingArray() throws Exception {
        int[] expectResult = {1, 2, 4, 5, 12};
        int[] result = Array.sorting(array);

        Assert.assertArrayEquals(expectResult, result);
    }
}
