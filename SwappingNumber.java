import java.util.Scanner;

public class SwappingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your first number");
        int a = scanner.nextInt();

        System.out.println("Enter your second number");
        int b = scanner.nextInt();

        
        int c = a;
        a = b;
        b = c;

        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);

        
    }
}
