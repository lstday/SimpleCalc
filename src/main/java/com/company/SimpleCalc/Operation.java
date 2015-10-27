package com.company.SimpleCalc;

/**
 * Created by lstday
 * 23.10.15.
 */

public interface Operation {
    /**
     * Calculates arithm. operations on 2 args
     *
     * @param firstAtg  - first argument
     * @param secondAtg - second argument
     * @return - result of operation
     */
    double calculate(double firstAtg, double secondAtg);

    /**
     * Define key operation
     * @return key for map of com.company.SimpleCalc.Operation-values
     */
    char key();
}
