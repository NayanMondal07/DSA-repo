import java.util.Scanner;

public class factorialrecursion {
    static int factorial(int n){
        if(n==0||n==1)
        return 1;
        else
        return n*factorial(n-1);
        





    }
     


    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reasult = factorial(num);
        System.out.println(reasult);


        
        
        
    }
}
    
    

