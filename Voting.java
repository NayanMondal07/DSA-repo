import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("ypu are not eligable for vote");
        }
    }
    
}
