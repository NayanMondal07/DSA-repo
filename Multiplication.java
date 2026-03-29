import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the multiplication table\n");
        System.out.print("Enter the number you want to print: ");
        
        int num = scanner.nextInt();
        
        System.out.println("Your multiplication table is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        
    }
}

