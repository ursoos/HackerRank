import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/6/2017.
 */
public class MigratoryBirdsTest {
    @Test
    public void compute() throws Exception {
        int [] flock = new int [] {1,  4,  4,  4,  5 , 3};
        assertEquals("first sample",4,MigratoryBirds.compute(flock)  );
    }

}