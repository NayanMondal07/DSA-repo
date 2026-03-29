import java.util.Scanner;

public class Fibonachiseries {
    
    public static void main(String[] args) {
        System.out.print("Entre your number");
        Scanner scanner = new scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int a= 0;b =1, c;
        for (int i = 1 ; i<=num ; i++){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;

        }
    }
    
}
