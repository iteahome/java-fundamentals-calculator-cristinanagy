import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double x = reader.nextDouble();
        double y = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':

                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;

            default:
                System.out.printf("Operator is not correct. Enter an operator (+, -, *, /) ");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", x, operator, y, result);
    }
}
