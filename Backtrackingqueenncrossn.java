public class Backtrackingqueenncrossn {
    public static boolean isafe(char[][]board,int row,int col){
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
            

        }
        return true;
        

    }
    public static void nqueen(char[][] boad,int row ){
        if(row==boad.length){
           // printrow(boad);
            count++;
            return;
        }
        for(int j=0;j<boad.length;j++){
            if(isafe(boad,row,j)){
            boad[row][j]='Q';
            nqueen(boad, row+1);
            boad[row][j]='.';

            
        }
    }
}
    public static void printrow(char[][] boad){
        for(int i =0;i<boad.length;i++){
            for(int j =0;j<boad.length;j++){
                System.out.print(boad[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[]args){
        int n = 4;
        char [][]boad = new char[n][n];
        for(int i=0;i<boad.length;i++){
            for(int j = 0;j<boad.length;j++){
                boad[i][j]='.';
            }
        }
        nqueen(boad,0);
        System.out.println("Your count number is "+count);
    }
    
}
