/**
 * Created by lstday
 * 23.10.15.
 */

public class Exponentiation implements Operation {

    @Override
    public double calculate(double firstAtg, double secondAtg) {
        return Math.pow(firstAtg, secondAtg);
    }

    @Override
    public char key() {
        return '^';
    }
}
