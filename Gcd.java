import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Corrected scanner name

        System.out.println("Enter your first number:");
        int a = scanner.nextInt();

        System.out.println("Enter your second number:");
        int b = scanner.nextInt(); 

        int g = 1; 

        for (int i = 1; i <= Math.min(a, b); i++) { 
            if (a % i == 0 && b % i == 0) { 
                g = i;
            }
        }

        System.out.println("The GCD of " + a + " and " + b + " is: " + g);

        scanner.close(); 
    }
}

