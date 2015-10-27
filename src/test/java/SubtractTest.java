import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lstday
 * 27.10.15.
 */
public class SubtractTest {

    @Test
    public void testCalculate() throws Exception {
        Subtract subtract = new Subtract();
        Assert.assertEquals(subtract.calculate(4, 3), (double) 1);
    }
}