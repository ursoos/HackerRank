import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ursus on 6/4/2017.
 */
public class BreakingTheRecordsTest {
    @Test
    public void getRecord() throws Exception {
        int [] input = new int [] {3, 4 ,21, 36 ,10 ,28 ,35 ,5 ,24, 42};
        int [] expectedOutput = new int [] {4, 0};
        assertArrayEquals(expectedOutput, BreakingTheRecords.getRecord(input));

    }

}