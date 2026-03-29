import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your array size ");
        size = scanner.nextInt();
        int []arr=new int[size+1];
        System.out.println("Entre your array");
        for(int i =0;i<size;i++){
        arr[i]=scanner.nextInt();
        }
        System.out.print("Entre the location you want to insrt");
        loc = scanner.nextInt();
        System.out.print("Entre the value you want to insert");
        item = scanner.nextInt();
        for(int i =size;i>loc;i--){
            arr[i] = arr[i-1];
            
        }
        arr[loc]=item;
        size++;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }
    
}
