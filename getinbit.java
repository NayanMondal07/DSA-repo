public class getinbit {
    public static int bitmas (int n,int i){
        int bitmas = 1<<i;
        if((n&bitmas)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(bitmas(10, 2));
        
    }
    
}
