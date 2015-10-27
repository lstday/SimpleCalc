import com.company.SimpleCalc.Division;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by lstday
 * 27.10.15.
 */
public class DivisionTest {

    @Test
    public void testCalculate() throws Exception {
        Division division = new Division();
        Assert.assertEquals(division.calculate(6, 3), (double) 2);
    }

}