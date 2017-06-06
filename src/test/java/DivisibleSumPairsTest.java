import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/6/2017.
 */
public class DivisibleSumPairsTest {
    @Test
    public void solve() throws Exception {
      int k = 3 ;
      int input [] = new int [] {1, 3 ,2 ,6 ,1 ,2};
      assertEquals("first example", 5, DivisibleSumPairs.solve(k, input));


    }

}