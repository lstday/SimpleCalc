/**
 * Created by lstday
 * 22.10.15.
 */

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.load(new Subtract());
        calc.load(new Summation());
        calc.load(new Division());
        calc.load(new Exponentiation());
        calc.load(new Multiplication());
        calc.load(new Subtract());

        calc.init();
    }
}

