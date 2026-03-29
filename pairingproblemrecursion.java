public class pairingproblemrecursion {
    public static int pairproblem(int n){
        if(n==1 || n==2){
            return n;
        }
        int fm1 = n-1;
        int fm2 = n-2;
        int total = fm1*fm2;
        int totalways = fm2+total;
        return totalways;
        

    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);
        
    }
    
}
