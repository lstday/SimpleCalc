import java.util.Scanner;

/**
 * Created by lstday
 * 22.10.15.
 */

public interface ReadUserInput {
    char getCharOperator();

    char getAnswer();

    Double getDoubleValue();

    Scanner scanner = new Scanner(System.in);
}
