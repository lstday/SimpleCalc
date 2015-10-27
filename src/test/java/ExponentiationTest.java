import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lstday
 * 27.10.15.
 */
public class ExponentiationTest {

    @Test
    public void testCalculate() throws Exception {
        Summation summation = new Summation();
        Assert.assertEquals(summation.calculate(4, 3), Double.parseDouble("64"));
    }
}