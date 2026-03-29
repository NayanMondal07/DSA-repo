public class setbit {
    public static int setbit(int n ,int i){
        int bitmas = 1<<i;
        return n|i;
    }

    public static void main(String[] args) {
        System.out.println(setbit(10, 2));
        
    }
    
}
