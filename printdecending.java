public class printdecending {
    public static void printcall(int n){
        if(n==1){
            System.out.println(n);
            
            return ;
        }
        System.out.println(n);
        
        printcall(n-1);
        
    }

    public static void main(String[] args) {
        int n =10;
        printcall(n);
        
    }
    
}
