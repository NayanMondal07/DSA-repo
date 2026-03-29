import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int first = input.nextInt();

        System.out.println("Enter your second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Your result is: " + result);

     
    }
}

