public class tilingproblem {
    public static int tilingprob(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fm1=tilingprob(n-1);
        int fm2=tilingprob(n-2);
        int tilecount = fm1+fm2;
        return tilecount;
    }
    public static void main(String[] args) {
        System.out.println(tilingprob(3));
        
    }
    
}
