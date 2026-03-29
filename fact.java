public class fact {
    public static int factu(int n){
        if(n==0){
            return 1;
        }
        int fnu = factu(n-1);
        int fnu1 = n * fnu;
        return fnu1;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(factu(n));
    }
    
}
