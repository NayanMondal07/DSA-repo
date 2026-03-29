public class clearbit {
    public static int clearbit(int n , int i){
        int bitmas = ~(1<<i);
        return n&i;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(10, 02));
        
    }
    
}
