/**
 * Created by lstday
 * 22.10.15.
 */

public class Calculator {
    ReadOperations someOperations = new ReadOperations();

    public void init() {
        System.out.println("Hello stranger. You are in SimpleCalc.");
        while (true) {
            System.out.println("Do you want calculate? (Press \"y\" for init, \"q\" (or other key) for quit");

//            if (someOperations.scanner.next().equalsIgnoreCase("y")) { //поарвил
            if (("y").equals(someOperations.scanner.next().toLowerCase())) {
                System.out.println("Okay! As you can now, this Calculator work that way: you must enter first value, than you must enter second value. After that you must enter arithmetic operation. If all thing done right - you'll get result!");
                System.out.println("First you must enter first value: (q for exit)");
                Double first = someOperations.scanDouble();
                System.out.println("Than you must enter second value: (q for exit)");
                Double second = someOperations.scanDouble();
                System.out.println("Ok. Now you must enter math operation");
                char operator = someOperations.scanOperator();
                System.out.print("Now your result is ");
                Double result = someOperations.getResult(first, second, operator);
                System.out.println(result);

            } else {
                System.out.println("Good day!");
                System.exit(1);
            }
        }
    }
}