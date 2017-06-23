import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/23/2017.
 */
public class DrawingBookTest {
    @Test
    public void solve() throws Exception {
        assertEquals("first example", 1, DrawingBook.solve(6,2));
        assertEquals("second example", 0, DrawingBook.solve(5,4));


    }

}