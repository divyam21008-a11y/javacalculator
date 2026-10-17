
import java.util.Scanner;

public class CalculatorDiv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 


        int choice = 0;
        double num1, num2, result;
        int n;

        System.out.println("==================================");
        System.out.println("       WELCOME TO CALCULATOR");
        System.out.println("==================================");

        while (choice != 10) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Percentage");
            System.out.println("9. Factorial");
            System.out.println("10. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Addition = " + result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.println("Subtraction = " + result);
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.println("Multiplication = " + result);
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division = " + result);
                    } else {
                        System.out.println(
                            "Error! Division by zero is not allowed."
                        );
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("Remainder = " + result);
                    } else {
                        System.out.println(
                            "Error! Divisor cannot be zero."
                        );
                    }
                    break;

                case 6:
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();

                    result = Math.pow(num1, num2);

                    System.out.println("Power = " + result);
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();

                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                        System.out.println("Square Root = " + result);
                    } else {
                        System.out.println(
                            "Error! Negative number has no real square root."
                        );
                    }
                    break;

                case 8:
                    System.out.print("Enter total amount: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter percentage: ");
                    num2 = sc.nextDouble();

                    result = (num1 * num2) / 100;

                    System.out.println("Percentage = " + result);
                    break;

                case 9:
                    System.out.print(
                        "Enter a non-negative integer (0-170): "
                    );
                    n = sc.nextInt();

                    if (n < 0 || n > 170) {
                        System.out.println(
                            "Please enter a number between 0 and 170."
                        );
                    } else {
                        double fact = 1;
                        int i = 1;

                        while (i <= n) {
                            fact = fact * i;
                            i++;
                        }

                        System.out.println("Factorial = " + fact);
                    }
                    break;

                case 10:
                    System.out.println(
                        "Thank you for using the calculator!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select 1 to 10."
                    );
            }
        }

        sc.close();
    }
}
