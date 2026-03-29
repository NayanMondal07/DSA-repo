import java.util.Scanner;

public class Arraytwo {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your number");
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=scanner.nextInt();

            }
        }
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();;
        }


    }
    
}
