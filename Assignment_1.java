import java.util.Scanner;
public class Assignment_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char task;
		
		do {
			System.out.println("\n********** MENU **********");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            int select = sc.nextInt();
            
            switch (select) {
            case 1:
            	System.out.println("Enter Number: ");
            	int n = sc.nextInt();
            	System.out.println("Table of" + n + ":");
            	for (int i = 1; i <= 10 ; i++) {
            		System.out.println(n + "x" + i+"="+(n*i));
            		
            	}
            	break;
            case 2: // Factorial
                System.out.print("Enter the number: ");
                int factNum = sc.nextInt();
                long factorial = 1;
                for (int i = 1; i <= factNum; i++) {
                    factorial *= i;
                }
                System.out.println("Factorial of " + factNum + " is: " + factorial);
                break;

            case 3: // Prime Check
                System.out.print("Enter the number: ");
                int primeNum = sc.nextInt();
                boolean isPrime = true;
                if (primeNum <= 1) {
                    isPrime = false;
                } else {
                    int i = 2;
                    while (i <= primeNum / 2) {
                        if (primeNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                        i++;
                    }
                }
                if (isPrime)
                    System.out.println(primeNum + " is a Prime Number.");
                else
                    System.out.println(primeNum + " is NOT a Prime Number.");
                break;

            case 4: 
                System.out.print("Enter how many terms: ");
                int terms = sc.nextInt();
                int first = 0, second = 1;
                System.out.print("Fibonacci Series: ");
                for (int i = 1; i <= terms; i++) {
                    System.out.print(first + " ");
                    int next = first + second;
                    first = second;
                    second = next;
                }
                System.out.println();
                break;

            case 5: 
                System.out.println("Exiting program. Goodbye!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice! Please choose between 1 to 5.");
        }


        System.out.print("Back to Menu? (Y/N): ");
        task = sc.next().charAt(0);

    } while (task == 'Y' || task == 'y');
    
    System.out.println("Program terminated.");
    sc.close();
            

		
		
	}

}
