import java.util.Scanner;

public class deletation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre the size of the array");
        int n = scanner.nextInt();
        int arr []= new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
            System.out.println("Entre the position you want to delet the array");
            int pos = scanner.nextInt();
            for(int i = pos;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            n--;
            for(int i =0;i<n;i++)
            System.out.println("your array after declaration is "+arr[i]);
            
        }
        

        }
        
    
    

