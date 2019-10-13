import java.util.Scanner;
// import java.util.InputMismatchException;

public class Calculator {
    public Calculator() {

    }

    public static void main(String[] args) {
        double valueX;
        double valueY;
        double result;
        char op;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        valueX = input.nextDouble();

        System.out.print("+ | - | / | * |");
        op = input.next().charAt(0);

        System.out.print("Enter second number: ");
        valueY = input.nextDouble();


        if (op == '+') {
            result = valueX + valueY;
        } else if (op == '-') {
            result = valueX - valueY;
        } else if (op == '*') {
            result = valueX * valueY;
        } else if (op == '/') {
            result = valueY != 0.0d ? valueX / valueY : 0.0d;
        } else {
            System.out.println("Error - invalid operator");
            result = 0.0d;
        }

        System.out.println(result);


        // Tried to todo with try-catch
        /*
        try {
            // Create Scanner
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            valueX = input.nextDouble();
            // Prompt until you get valid input
            while (!input.hasNextDouble()) {
                System.out.print("Enter first number: ");
                valueX = input.nextDouble();
            }

            System.out.print("+ | - | / | * |");
            // Check first char
            op = input.next().charAt(0);

            System.out.print("Enter second number: ");
            valueY = input.nextDouble();

            // Close scanner after completion
            input.close();

            if (op == '+') {
                result = valueX + valueY;
            } else if (op == '-') {
                result = valueX - valueY;
            } else if (op == '*') {
                result = valueX * valueY;
            } else if (op == '/') {
                result = valueY != 0.0d ? valueX / valueY : 0.0d;
            } else {
                System.out.println("Error - invalid operator");
                result = 0.0d;
            }
        } catch (InputMismatchException exception) {
            System.out.print("Something went wrong please try again\nEnter first number: ");
            System.out.println(exception);
        } catch (Exception e) {
            System.out.println(e);
        }
        */

    }
}

