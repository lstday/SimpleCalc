package com.company.SimpleCalc;

/**
 * Created by lstday
 * 23.10.15.
 */

public class Division implements Operation {

    @Override
    public double calculate(double firstArg, double secondArg) throws SimpleCalcException {
        if (secondArg != 0)
            return firstArg / secondArg;
        else throw new SimpleCalcException("Division by zero is unacceptable!");
    }

    @Override
    public char key() {
        return '/';
    }
}
