public class fibrec {
    public static int fiibrec(int n){
        if (n==0 || n==1){
            return n;
        }
        int fib1 = fiibrec(n-1);
        int fib2 = fiibrec(n-2);
        int fibn = fib1+fib2;
        return fibn;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fiibrec(n));
    }
    
}
