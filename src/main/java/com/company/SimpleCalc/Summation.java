package com.company.SimpleCalc;

/**
 * Created by lstday
 * 23.10.15.
 */

public class Summation implements Operation {

    @Override
    public double calculate(double firstAtg, double secondAtg) {
        return firstAtg + secondAtg;
    }

    @Override
    public char key() {
        return '+';
    }
}
