import com.company.SimpleCalc.Summation;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lstday
 * 27.10.15.
 */
public class SummationTest {

    @Test
    public void testCalculate() throws Exception {
        Summation summation = new Summation();
        Assert.assertEquals(summation.calculate(4, 3), (double) 7);
    }
}