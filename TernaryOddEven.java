import java.util.Scanner;

public class TernaryOddEven {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre your number We will calculate using Ternary oprator");
        System.out.println("Entre your Number");
        int num = scanner.nextInt();
        String result = num%2==0 ? "Even":"Odd";
        System.out.println(":Your number is result"+result);
    }
}
