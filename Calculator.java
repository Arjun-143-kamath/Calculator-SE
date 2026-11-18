import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== JAVA MODULAR CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result = 0;

                switch (choice) {

                    case 1:
                        result = Addition.calculate(a, b);
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        result = Subtraction.calculate(a, b);
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        result = Multiplication.calculate(a, b);
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        try {
                            result = Division.calculate(a, b);
                            System.out.println("Result: " + result);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }

            } else if (choice == 5) {
                System.out.println("Exiting Calculator. Goodbye!");

            } else {
                System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}