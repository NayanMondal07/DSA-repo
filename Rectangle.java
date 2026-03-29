import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre your Length");
        int length = sc.nextInt();
        System.out.println("Entre your breadth");
        int breadth = sc.nextInt();
        sc.close();
        System.out.println("Your lenghth of the rectangle is "+2*(length+breadth));
        
    }
    
}
