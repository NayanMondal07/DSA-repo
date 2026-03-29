import java.util.Scanner;  // Import Scanner class

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  


        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (per annum): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        
        System.out.println("Final Amount = " + amount);
        System.out.println("Compound Interest = " + compoundInterest);

    }
}