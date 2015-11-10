package com.company.SimpleCalc;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lstday
 * 22.10.15.
 */

public class Calculator {
    private Double firstArg = null;
    private Double secondArg = null;
    private Double result = null;
    private Double tempResult = null;

    private final Map<Character, Operation> operations = new LinkedHashMap<>();

    public void load(Operation operation) {
        operations.put(operation.key(), operation);
    }

    /**
     * Main method with the game logic.
     */
    public void init() {
        System.out.println("Hello stranger. You are in SimpleCalc.");
        try (ReadUserInputImpl userInput = new ReadUserInputImpl()) {
            System.out.println("Do you want calculate? (Press \"y\" for init, \"q\" or \"n\" for quit");
            char exit = userInput.getAnswer();
            while (exit != 'n' && exit != 'q') {

                showRules();
                oldResultManipulations(userInput);
                if (firstArg == null) {
                    System.out.println("Ready? First you must enter first value: (q for exit)");
                    firstArg = userInput.getDoubleValue();
                }
                if (secondArg == null) {
                    System.out.println("Than you must enter second value: (q for exit)");
                    secondArg = userInput.getDoubleValue();
                }
                System.out.println("Ok. Now you must enter math operation");
                char operator = userInput.getCharOperator();
                result = countResult(firstArg, secondArg, operator);
                if (result != null) {
                    System.out.printf("Now your result is %.1f\n", result);
                }
                tempResult = result;

                System.out.println("One more time?");
                exit = userInput.getAnswer();
            }
            System.out.println("Good day!");
        } catch (Exception e) { //TODO fix this exception type.
            e.printStackTrace();
        }
    }

    private Double countResult(Double firstArg, Double secondArg, char operator) {
        Operation operation = operations.get(operator);
        try {
            return operation.calculate(firstArg, secondArg);
        } catch (SimpleCalcException e) {
            System.out.println(e.getMessage());
            System.out.println("Please next time enter correct values.");

        }
        return null;
    }

    /**
     * ASks user to use old result as a first or second value.
     * This method I will soon alter.
     **/
    private void oldResultManipulations(ReadUserInputImpl userInput) { //TODO alter method body
        if ((result != null) || (firstArg != null) || (secondArg != null)) {
            System.out.println("Do you wanna use result of previous round?");
            char useOldResult = userInput.getAnswer();
            if (useOldResult == 'n') {
                flushPreviousResults();
                System.out.println("Okay. Result was flushed.");
            } else if (useOldResult == 'y') {
                System.out.println("Okay, if you wanna use older result, we need to understand something. Will it be the firstArg value?");
                useOldResult = userInput.getAnswer();
                if (useOldResult == 'y') {
                    flushPreviousResults();
                    System.out.println("Okay, we will use old result as first value!");
                    firstArg = tempResult;
                } else if (useOldResult == 'n') {
                    System.out.println("Will it be the second value?");
                    useOldResult = userInput.getAnswer();
                    if (useOldResult == 'y') {
                        flushPreviousResults();
                        System.out.println("Okay, we will use old result as secondArg value!");
                        secondArg = tempResult;
                    } else if (useOldResult == 'n') {
                        System.out.println("Okay, we will not use old result");
                        flushPreviousResults();
                    }
                }
            }
        }
    }

    /**
     * Nulls all arguments after user decides to use(or not to use) previous result
     */
    private void flushPreviousResults() {
        firstArg = null;
        secondArg = null;
        result = null;
    }

    /**
     * This is rules. Big string which i decide to move in method.
     */
    private void showRules() {
        System.out.printf("Okay! As you can now, this %s work that way: you must enter firstArg value, than you must enter secondArg value. After that you must enter arithmetic operation. If all thing done right - you'll get result!\n", Calculator.class.getSimpleName());
    }
}