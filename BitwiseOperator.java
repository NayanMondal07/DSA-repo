import java.util.Scanner;

public class BitwiseOperator {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your first number");
        int first = scanner.nextInt();
        System.out.println("Entre your second number");
        int second = scanner.nextInt();
        int result = first &second;
        System.out.println("Result is "+result);

    }
}
