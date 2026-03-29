import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre your marks");
        int a = scanner.nextInt();
        if(a>=90){
            System.out.println("Excilent!you have score grade A");
        }else if (a>=75){
            System.out.print("Good you have scored B grade");
        }else if (a>=60){
            System.out.println("You have scored grade C");
        }else if (a>=30){
            System.out.println("You have scored grade D");
        }else if  (a<=30) {
System.out.println("You are unable to pass the exam and got a grade D");
        }
        



    }
    
}
