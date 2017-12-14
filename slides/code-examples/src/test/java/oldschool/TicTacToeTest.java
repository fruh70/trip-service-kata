package oldschool;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class TicTacToeTest {

    @Test
    public void name() throws Exception {
        int[] ints = {1, 2, 3};
        int[] ints1 = {1, 2, 3};

        assertTrue(ints.equals(ints1));
        Assert.assertEquals(ints, ints1);
    }

    @Test
    public void havingFirstColumnIsAWin() {
        String board =
                "X-O" +
                "XOO" +
                "XOX";


    }
}