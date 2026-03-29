import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("entre the size of the array");
        int size = scanner.nextInt();
        int arr []= new int [size];
        for (int i =0;i<size;i++){
            arr[i]=scanner.nextInt();

        }
        int sum =0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("your sum is "+sum);

        


    }
    
}
