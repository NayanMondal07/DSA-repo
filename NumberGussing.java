import java.util.Scanner;

public class NumberGussing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=5;
        int guess;
        do{
            System.out.println("Entre your number");
             guess =scanner.nextInt();

        }while (num!=guess);
        System.out.println("You have sucessfully guess the number");
    }

    
}
