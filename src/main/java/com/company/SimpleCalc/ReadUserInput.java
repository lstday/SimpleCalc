package com.company.SimpleCalc;

/**
 * Created by lstday
 * 22.10.15.
 */

public interface ReadUserInput {
    /**
     * Gets operator from user
     * @return char, arithmetic operation
     */
    char getCharOperator();

    /**
     * Gets user decision
     * @return user answer
     */
    char getAnswer();

    /**
     * Gets user value for operate
     * @return
     */
    Double getDoubleValue();
}
