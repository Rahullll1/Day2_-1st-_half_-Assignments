package Math;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Math math = new Math();
        int opt;
        int num;
        char again;

        do {
            System.out.println("\n****** MATH MENU ******");
            System.out.println("1. Print Table");
            System.out.println("2. Factorial");
            System.out.println("3. Check Prime");
            System.out.println("4. Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("************************");
            System.out.print("Enter choice: ");
            opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter number: ");
                    num = scan.nextInt();
                    math.printTable(num);
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    num = scan.nextInt();
                    long fact = math.factorial(num);
                    System.out.println("Factorial of " + num + " is: " + fact);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    num = scan.nextInt();
                    boolean prime = math.isPrime(num);
                    System.out.println(num + (prime ? " is Prime." : " is Not Prime."));
                    break;

                case 4:
                    System.out.print("Enter term count: ");
                    num = scan.nextInt();
                    math.fibonacci(num);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.print("Back to menu? (Y/N): ");
            again = scan.next().charAt(0);
        } while (again == 'Y' || again == 'y');

        System.out.println("Program closed.");
        scan.close();
    }
}
