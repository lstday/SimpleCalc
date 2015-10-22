/**
 * Created by lstday
 * 22.10.15.
 */

public class ReadUserInputImpl implements ReadUserInput, AutoCloseable {

    @Override
    public Double getDoubleValue() {
        Double scanned = null;

        do {
            if (scanner.hasNextDouble()) {
                scanned = scanner.nextDouble();
            } else {
                if (scanner.hasNext("q"))
                    System.exit(0); //TODO fix exit mechanism. Seems need fix method entirely.
                System.out.println("You must enter value. Press \"q\" for exit");
                scanner.next();
            }
        } while (scanned == null);
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
