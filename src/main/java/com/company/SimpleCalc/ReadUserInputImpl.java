package com.company.SimpleCalc;

import java.util.Scanner;

/**
 * Created by lstday
 * 22.10.15.
 */

/**
 * This class implemented and operates with user input
 */
public class ReadUserInputImpl implements ReadUserInput, AutoCloseable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Double getDoubleValue() {
        Double scanned = null;
        do {
            if (scanner.hasNextDouble()) {
                scanned = scanner.nextDouble();
            } else {
                if (scanner.hasNext("q")) {
                    System.out.println("Entered q - emergency exit");
                    System.exit(0);
                }
                System.out.println("You must enter value. Press \"q\" for exit");
                scanner.next();
            }
        } while (scanned == null);
        return scanned;
    }

    @Override
    public char getCharOperator() {
        char scanned = ' ';
        do {
            System.out.println("You must enter + or - or / or * or ^");
            String tBuffer = scanner.next();
            scanned = tBuffer.charAt(0);
        } while ((scanned != '+') && (scanned != '-') && (scanned != '/') && (scanned != '*') && (scanned != '^'));
        return scanned;
    }

    @Override
    public char getAnswer() {
        String tempStringAnswer = "";
        do {
            tempStringAnswer = scanner.next();
            if ((!"y".equalsIgnoreCase(tempStringAnswer) && !"n".equalsIgnoreCase(tempStringAnswer) && !"q".equalsIgnoreCase(tempStringAnswer)))
                System.out.println("You must enter y or n or q! Do it!");
        }
        while (!"y".equalsIgnoreCase(tempStringAnswer) && !"n".equalsIgnoreCase(tempStringAnswer) && !"q".equalsIgnoreCase(tempStringAnswer));
        if ("y".equalsIgnoreCase(tempStringAnswer)) return 'y';
        else if ("n".equalsIgnoreCase(tempStringAnswer)) return 'n';
        else return 'q';
    }

    @Override
    public void close() throws Exception {
        scanner.close();
    }
}
