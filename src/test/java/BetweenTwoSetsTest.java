import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/4/2017.
 */
public class BetweenTwoSetsTest {
    @Test
    public void getTotalX() throws Exception {
        int[] a = new int[]{2, 4};
        int[] b = new int[]{16, 32, 96};
        Assert.assertEquals(3, BetweenTwoSets.getTotalX(a, b));
        a = new int[]{2, 3, 6};
        b = new int[]{42, 84};
        Assert.assertEquals(2, BetweenTwoSets.getTotalX(a, b));
        a = new int[]{3, 9, 6};
        b = new int[]{36, 72};
        Assert.assertEquals(2, BetweenTwoSets.getTotalX(a, b));


    }

}