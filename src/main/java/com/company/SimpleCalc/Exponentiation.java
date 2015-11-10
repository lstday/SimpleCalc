package com.company.SimpleCalc;

/**
 * Created by lstday
 * 23.10.15.
 */

public class Exponentiation implements Operation {

    @Override
    public double calculate(double firstArg, double secondArg) {
        return Math.pow(firstArg, secondArg);
    }

    @Override
    public char key() {
        return '^';
    }
}
