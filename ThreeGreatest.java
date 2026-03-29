import java.util.Scanner;

public class ThreeGreatest {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your first numberr");
        int a = scanner.nextInt();
        System.out.println("Entre your Second number");
        int b =scanner.nextInt();
        System.out.println("Entre your third number");
        int c = scanner.nextInt();
        if (a>=b && a>=c){
            System.out.println("A is the greatest number");
        } else if (b>=a && b>=c){
            System.out.println("B is the greatest number");
        } else if (c>=a && c>=b){
            System.out.println("C is the greatest number");
        }

        

        

        


    }
    
}
