import java.util.Scanner;

public class FibonachiSeriesRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the number the element to be print");
        int count = scanner.nextInt();
        for (int i = 1; i<=count;i++){
        System.out.print(fibonacci(i)+" ");
    }

    
}
public static int fibonacci(int position){
    if (position==1){
        return 0;
    }if (position==2){
        return 1;
    }
    return fibonacci(position-1)+fibonacci(position-2);
}
}
