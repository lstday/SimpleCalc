import com.company.SimpleCalc.Exponentiation;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lstday
 * 27.10.15.
 */
public class ExponentiationTest {

    @Test
    public void testCalculate() throws Exception {
        Exponentiation exponentiation = new Exponentiation();
        Assert.assertEquals(exponentiation.calculate(4, 3), (double) 64);
    }
}