import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int num [][]=new int [row][col];
        for(int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=scanner.nextInt();
                

            }
        }
        for (int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(num[i][j]+" ");

            }
            System.out.println();
        }
    }
    
}
