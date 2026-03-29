import java.util.Scanner;  

public class EligibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your age to apply for a driving license:");
        int age = scanner.nextInt(); 

        if (age >= 18) {
            System.out.println("You are eligible for a driving license.");
        } else {
            System.out.println("You are not eligible for a driving license.");
        }

        
    }
}

