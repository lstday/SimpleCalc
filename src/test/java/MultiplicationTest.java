import com.company.SimpleCalc.Multiplication;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lstday
 * 27.10.15.
 */
public class MultiplicationTest {

    @Test
    public void testCalculate() throws Exception {
        Multiplication multiplication = new Multiplication();
        Assert.assertEquals(multiplication.calculate(4, 3), (double) 12);
    }
}