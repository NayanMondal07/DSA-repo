import java.util.Scanner;

public class insert2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr []=new int[size+1];
        System.out.println("entre array");
        for(int i =0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("entre pos");
        int pos = scanner.nextInt()-1;
        System.out.println("entre the num");
        int num = scanner.nextInt();
        for(int i = size;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
        size++;
        for(int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    
}
