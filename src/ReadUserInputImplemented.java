import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by lstday
 * 22.10.15.
 */

public class ReadUserInputImplemented implements Operations, AutoCloseable {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Double getDoubleValue() {
        Double scanned = null;
        do {
            try {
                scanned = scanner.nextDouble();
            } catch (InputMismatchException e) {
                if (scanner.hasNext("q"))
                    break;
                System.out.println("Tou must enter value. Press \"q\" for exit");
                scanner.next();
            }
        } while (scanned == null);
//        System.out.println("You entered " + scanned);
        return scanned;
    }

    @Override
    public char getCharOperator() {
        char scanned = ' ';
        char[] chars;
        do {
            System.out.println("You must enter + or - or / or * or ^");
            String tBuffer = scanner.next();
            scanned = tBuffer.charAt(0);
        } while ((scanned != '+') && (scanned != '-') && (scanned != '/') && (scanned != '*') && (scanned != '^'));
//        System.out.println("You entered " + scanned);
        return scanned;
    }

     @Override
    public char getAnswer() {
        Character answer = null;
        String tempStringAnswer = "";
        do {
            tempStringAnswer = scanner.next();
            if ((!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q")))
                System.out.println("You must enter y or n or q! Do it!");
        }
        while (!tempStringAnswer.equalsIgnoreCase("y") && !tempStringAnswer.equalsIgnoreCase("n") && !tempStringAnswer.equalsIgnoreCase("q"));
        if (tempStringAnswer.equalsIgnoreCase("y")) return 'y';
        else if (tempStringAnswer.equalsIgnoreCase("n")) return 'n';
        else return 'q';
    }

    @Override
    public void close() throws Exception {
        scanner.close();
    }
}
