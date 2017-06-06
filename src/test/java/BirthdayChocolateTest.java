import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/6/2017.
 */
public class BirthdayChocolateTest {
    @Test
    public void solve() throws Exception {

        int size = 5;
        int [] bar = new int[] {1, 2, 1, 3, 2} ;
        int sum = 3;
        int numberOfElements = 2;
        int result = BirthdayChocolate.solve(size, bar, sum, numberOfElements);
        assertEquals(2, result);
        size = 31;
        bar = new int [] {2, 2, 2, 1, 3, 2, 2, 3, 3, 1, 4, 1, 3, 2, 2, 1, 2, 2, 4, 2, 2, 3, 5, 3, 4, 3, 2, 1, 4, 5, 4};
        sum = 10;
        numberOfElements = 4;
        result = BirthdayChocolate.solve(bar.length, bar, sum, numberOfElements);
        assertEquals("bigger set false", 7, result );

    }

}